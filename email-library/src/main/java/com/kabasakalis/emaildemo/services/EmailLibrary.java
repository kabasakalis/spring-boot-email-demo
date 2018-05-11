package com.kabasakalis.emaildemo.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailLibrary {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(
        final String fromEmail,
        final String toEmail,
        final String replyToEmail,
        final String subject,
        final String content)
        throws MessagingException {

        // Prepare message using a Spring helper
        final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
        final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setReplyTo(replyToEmail);
        message.setSubject(subject);
        message.setText(content);

        // Send email
        this.mailSender.send(mimeMessage);
    }
}
