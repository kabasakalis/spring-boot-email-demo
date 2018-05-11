package com.kabasakalis.emaildemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import javax.mail.MessagingException;

import com.kabasakalis.emaildemo.domain.Email;
import com.kabasakalis.emaildemo.services.EmailService;


import com.kabasakalis.emaildemo.services.EmailLibrary;

@Controller
public class EmailController {

  private static final String COMPANY_EMAIL = "kabasakalis@gmail.com";
  private static final String FROM_COMPANY_EMAIL = "kabasakalis@gmail.com";

  @Autowired
  private EmailService emailService;

  @GetMapping("/email-form")
  public String emailForm(Model model) {

    System.out.println(EmailLibrary.testLib());
    model.addAttribute("email", new Email());
    return "email-form";
  }

  @PostMapping("/send-email")
  public String emailSubmit(@ModelAttribute Email email) throws MessagingException  {
    // Use service to send email
    emailService.sendEmail(
        FROM_COMPANY_EMAIL,
        COMPANY_EMAIL,
        email.getClientEmail(),
        email.getEmailSubject(),
        email.getContent());
    return "result";
  }

}


