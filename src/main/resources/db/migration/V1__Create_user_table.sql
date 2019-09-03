create table user (
    id serial PRIMARY KEY,
    company_id bigint NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table auth_chain (
    id serial PRIMARY KEY,
    user_id bigint NOT NULL,
    auth_type character varying NOT NULL,
    rule_id bigint NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table password_rule (
    id serial PRIMARY KEY,
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

create table otp_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    allowed_retry_count integer NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table duo_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    allowed_retry_count integer NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table saml_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table ad_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table ip_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    address character varying NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table devise_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table fido_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table client_certificate_rule (
    id serial PRIMARY KEY,
    chain_id bigint NOT NULL REFERENCES auth_chain(id),
    root_certificate_id bigint NOT NULL REFERENCES root_certificate(id),
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table root_certificate (
    id serial PRIMARY KEY,
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

create table auth_info (
    id serial PRIMARY KEY,
    last_sign_in_at timestamp without time zone,
    last_sign_in_ip inet,
    locked_at timestamp without time zone,
    unlocked_at timestamp without time zone,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

create table login_ip (
    id serial PRIMARY KEY,
    company_id bigint NOT NULL
);