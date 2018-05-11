package com.kabasakalis.emaildemo.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

// import javax.mail.MessagingException;
// import javax.mail.internet.MimeMessage;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.ApplicationContext;
// import org.springframework.mail.javamail.JavaMailSender;
// import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
// import org.thymeleaf.context.Context;
//
// import com.kabasakalis.emaildemo.config.SpringMailConfig;

@Service
public class EmailLibrary {

    // @Autowired
    // private ApplicationContext applicationContext;
    //
    // @Autowired
    // private JavaMailSender mailSender;

    // @Autowired
    // private TemplateEngine textTemplateEngine;

    public static String testLib(){
      return "Lib works!";
    }
    // public void sendEmail(
    //     final String fromEmail,
    //     final String toEmail,
    //     final String replyToEmail,
    //     final String subject,
    //     final String content)
    //     throws MessagingException {
    //
    //     // Prepare the evaluation context
    //     // final Context ctx = new Context(locale);
    //     // ctx.setVariable("name", recipientName);
    //
    //     // Prepare message using a Spring helper
    //     final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
    //     final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
    //     message.setFrom(fromEmail);
    //     message.setTo(toEmail);
    //     message.setReplyTo(replyToEmail);
    //     message.setSubject(subject);
    //     message.setText(content);
    //
    //     // Create the plain TEXT body using Thymeleaf
    //     // final String textContent = this.textTemplateEngine.process(EMAIL_TEXT_TEMPLATE_NAME, ctx);
    //
    //     // Send email
    //     this.mailSender.send(mimeMessage);
    // }



}
