package com.thePramodCoder.interview_practice_service3.SpringProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @Autowired
    private TwoFactorAuthenticationProperties twoFactorAuthenticationProperties;


    @GetMapping("/send2fa")
    public void send2faCode(){

        if(twoFactorAuthenticationProperties.isEnabled()){
            if(twoFactorAuthenticationProperties.getProvider().equals("sms")){
               // send via sms

            } else if (twoFactorAuthenticationProperties.getProvider().equals("email")) {
                // send via email

            }
        }
    }
}
