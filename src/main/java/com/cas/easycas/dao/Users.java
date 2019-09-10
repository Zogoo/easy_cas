package com.cas.easycas.dao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Users {
    String userName;
    String companyId;
    Boolean enabled;
}
