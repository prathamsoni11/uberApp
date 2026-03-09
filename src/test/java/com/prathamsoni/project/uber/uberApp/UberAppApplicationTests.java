package com.prathamsoni.project.uber.uberApp;

import com.prathamsoni.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

    @Autowired
    private EmailSenderService emailSenderService;

    @Test
    void contextLoads() {
        emailSenderService.sendEmail(
                "vamed56978@feriwor.com",
                "This is the Testing Email",
                "Body of my email"
        );
    }

    @Test
    void sendEmailMultiple() {
        String emails[] = {
                "vamed56978@feriwor.com",
                "watec99802@keecs.com"
        };

        emailSenderService.sendEmail(
                emails,
                "This is the Testing Email",
                "Body of my email"
        );
    }
}
