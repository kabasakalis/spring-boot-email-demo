package com.kabasakalis.emaildemo.services;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.kabasakalis.emaildemo.domain.Email;

@Controller
public class EmailController {

    @GetMapping("/email-form")
    public String emailForm(Model model) {
        model.addAttribute("email", new Email());
        return "email-form";
    }

    @PostMapping("/send-email")
    public String emailSubmit(@ModelAttribute Email email) {
      // Use service to send email
        return "result";
    }

}


