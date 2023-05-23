package org.example;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

public class SparkPostAdapter implements EmailSender{
    public void send(String from, String to, String subject, String body) {

        //Client client = new Client("API KEY");

        try {
            //client.sendMessage(from, to, subject, body, null);
            System.out.println("Message sent with SparkPost");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't send message with SparkPost");
        }
    }
}
