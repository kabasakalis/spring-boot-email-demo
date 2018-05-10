
package com.kabasakalis.emaildemo.domain;

public class Email {

    private String subject;
    private String emailSubject;
    private String clientEmail;
    private String clientName;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmailSubject() {
       return "Message from " + getClientName() + ". Subject: " + getSubject();
    }

}
