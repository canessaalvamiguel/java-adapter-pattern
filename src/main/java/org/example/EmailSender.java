package org.example;

public interface EmailSender {
    void send(String from, String to, String subject, String body);
}
