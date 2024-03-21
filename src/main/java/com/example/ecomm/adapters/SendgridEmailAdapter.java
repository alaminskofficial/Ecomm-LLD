package com.example.ecomm.adapters;


import com.example.ecomm.libraries.Sendgrid;
import org.springframework.stereotype.Component;

@Component
public class SendgridEmailAdapter implements EmailAdapter{

    private Sendgrid sendgrid = new Sendgrid();

    @Override
    public void sendEmail(String to, String subject, String body) {
        sendgrid.sendEmailAsync(to, subject, body);
    }
}
