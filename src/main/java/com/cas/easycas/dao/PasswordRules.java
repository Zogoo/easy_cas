package com.cas.easycas.dao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PasswordRules {
    Integer allowedRetryCount;
    Integer failedAttempts;
    Integer signInCount;
    String passwordSalt;
    String email;
    String encryptedPassword;
    String confirmationToken;
    String confirmedAt;
    String confirmationSentAt;
}
