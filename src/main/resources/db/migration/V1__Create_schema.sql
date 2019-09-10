-- User --
CREATE TABLE users (
    id bigserial PRIMARY KEY,
    user_name character varying,
    company_id bigint NOT NULL,
    enabled boolean NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE IF NOT EXISTS authorities (
  user_id bigint NOT NULL REFERENCES users(id),
  authority character varying NOT NULL
);

-- Authentication tables --
CREATE TABLE auth_chain (
    id bigserial PRIMARY KEY,
    user_id bigint NOT NULL,
    auth_type character varying NOT NULL,
    rule_id bigint NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE otp_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    allowed_retry_count integer NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE duo_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    allowed_retry_count integer NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE saml_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE ad_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE ip_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    address character varying NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE devise_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE fido_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE root_certificate (
    id bigserial PRIMARY KEY,
    company_id bigint NOT NULL,
    name character varying,
    common_name character varying,
    organization character varying,
    organizational_unit character varying,
    locality character varying,
    state character varying,
    country_name character varying,
    email character varying,
    root_certificate character varying,
    is_enforced boolean DEFAULT false NOT NULL,
    is_default boolean DEFAULT false NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE auth_info (
    id bigserial PRIMARY KEY,
    last_sign_in_at timestamp without time zone,
    last_sign_in_ip inet,
    locked_at timestamp without time zone,
    unlocked_at timestamp without time zone,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE login_ip (
    id bigserial PRIMARY KEY,
    company_id bigint NOT NULL
);

CREATE TABLE client_certificate_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    root_certificate_id bigint NOT NULL REFERENCES root_certificate(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE password_rule (
    id bigserial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    auth_info_id bigint NOT NULL REFERENCES auth_info(id),
    allowed_retry_count integer DEFAULT 0 NOT NULL,
    failed_attempts integer DEFAULT 0 NOT NULL,
    sign_in_count integer DEFAULT 0 NOT NULL,
    password_salt character varying,
    email character varying DEFAULT ''::character varying NOT NULL,
    encrypted_password character varying DEFAULT ''::character varying NOT NULL,
    confirmation_token character varying,
    confirmed_at timestamp without time zone,
    confirmation_sent_at timestamp without time zone,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

-- OAuth related tables --
DROP TABLE IF EXISTS oauth_client_details;
CREATE TABLE oauth_client_details (
  client_id character varying PRIMARY KEY,
  resource_ids character varying,
  client_secret character varying,
  scope character varying,
  authorized_grant_types character varying,
  web_server_redirect_uri character varying,
  authorities character varying,
  access_token_validity int,
  refresh_token_validity int,
  additional_information VARCHAR(4096),
  autoapprove character varying
);

DROP TABLE IF EXISTS oauth_client_token;
CREATE TABLE oauth_client_token (
  token_id character varying,
  token BYTEA,
  authentication_id character varying PRIMARY KEY,
  user_id bigint NOT NULL REFERENCES users(id),
  client_id character varying
);

DROP TABLE IF EXISTS oauth_access_token;
CREATE TABLE oauth_access_token (
  token_id character varying,
  token BYTEA,
  authentication_id character varying PRIMARY KEY,
  user_id bigint NOT NULL REFERENCES users(id),
  client_id character varying,
  authentication BYTEA,
  refresh_token character varying
);

DROP TABLE IF EXISTS oauth_refresh_token;
CREATE TABLE oauth_refresh_token (
  token_id character varying,
  token BYTEA,
  authentication BYTEA
);

DROP TABLE IF EXISTS oauth_code;
CREATE TABLE oauth_code (
  code character varying,
  authentication BYTEA
);

DROP TABLE IF EXISTS oauth_approvals;
CREATE TABLE oauth_approvals (
    userId character varying,
    clientId character varying,
    scope character varying,
    status character varying,
    expiresAt timestamp without time zone NOT NULL,
    lastModifiedAt timestamp without time zone NOT NULL
);

DROP TABLE IF EXISTS ClientDetails;
CREATE TABLE ClientDetails (
  appId character varying PRIMARY KEY,
  resourceIds character varying,
  appSecret character varying,
  scope character varying,
  grantTypes character varying,
  redirectUrl character varying,
  authorities character varying,
  access_token_validity int,
  refresh_token_validity int,
  additionalInformation character varying,
  autoApproveScopes character varying
);