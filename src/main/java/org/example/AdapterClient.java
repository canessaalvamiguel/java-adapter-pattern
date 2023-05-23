package org.example;

public class AdapterClient {
    private EmailSender sender;

    public AdapterClient(EmailSender sender) {
        this.sender = sender;
    }

    public void execute(){
        String from = "hola@mundo.com";
        String to = "hello@world.com";
        String subject = "Message from an adapter";
        String body = "Go, go, go..";

        sender.send(from, to, subject, body);
    }
}
