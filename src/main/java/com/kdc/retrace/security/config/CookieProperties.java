package com.kdc.retrace.security.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.cookie")
@Data
public class CookieProperties {
    private boolean secure;
    private String sameSite;
}
