package com.thePramodCoder.interview_practice_service3.SpringProfiles;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "feature.2fa")
@Component
public class TwoFactorAuthenticationProperties {

    public boolean enabled;
    private String provider;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
