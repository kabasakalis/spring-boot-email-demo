package thymeleafexamples.springmail.web.controller;

import java.io.IOException;
import java.util.Locale;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.kabasakalis.emaildemo.services.EmailService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class SendingController {

    @Autowired
    private EmailService emailService;

    /* Send plain TEXT mail */
    @RequestMapping(value = "/sendMailText", method = POST)
    public String sendTextMail(
        @RequestParam("recipientName") final String recipientName,
        @RequestParam("recipientEmail") final String recipientEmail,
        final Locale locale)
        throws MessagingException {

        this.emailService.sendTextMail(recipientName, recipientEmail, locale);
        return "redirect:sent.html";

    }


}
