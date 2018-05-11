# Spring Boot Email Demo
----
#### Showcasing the inclusion of a module/subproject as a library with gradle

The main root  project is an MVC Spring Boot application which includes an email library.
The library is a completely independent project in `email-library` folder, with it's own
`build.gradle` file, including only the Sping mail relevant dependencies. It can be built
on it's own with gradle and also can be it's own separate git repository, it's included
here in the main git repository just for convenience.

---
The gradle configuration necessary for the main project to include the email library is the
following:
-   in `settings.gradle` of main project we add the line `include 'email-library'`
-   in `build.gradle` file of the main project  we add the line  `compile project(':email-library')`

And that's all, when we compile the main project, email-library will also build a jar which
will automatically be included in the classpath of the main project.

## Running the email-demo in your local machine.
- The main application uses the email library for a contact form.
- In `EmailController` file provide email addresses for `COMPANY_EMAIL` and `COMPANY_EMAIL_FROM`
- In `src/main/resources/mail/emailconfig.properties` fill in your Gmail credentials
to use the Gmail SMTP server. **CAUTION: Do not forget to remove or encrypt your credentials
if you intend to upload this project as a public repository.**
- Run `gradle bootRun`
- Go to `localhost:8080/email-form`
- Fill in and submit the contact form. This will send the contact data to `COMPANY_EMAIL`
- Go to `COMPANY_EMAIL` inbox, you should see an email with the contact data submitted.
