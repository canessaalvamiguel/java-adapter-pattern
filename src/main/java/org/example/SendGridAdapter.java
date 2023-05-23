package org.example;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

public class SendGridAdapter implements EmailSender{
    public void send(String from, String to, String subject, String body) {
        Email fromAddres = new Email(from);
        Email toAddress = new Email(to);
        Content content = new Content("text/plain", body);
        Mail mail = new Mail(fromAddres, subject, toAddress, content);

        SendGrid sg = new SendGrid("API KEY");
        Request request = new Request();

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            //sg.api(request);
            System.out.println("Message sent with SendGrid");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Couldn't send message with SendGrid");
        }
    }
}
