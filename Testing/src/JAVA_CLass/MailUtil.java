package JAVA_CLass;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

import org.openqa.selenium.bidi.script.Message;
import org.openqa.selenium.grid.graphql.Session;
import org.openqa.selenium.virtualauthenticator.VirtualAuthenticatorOptions.Transport;

public class MailUtil {

    public static void sendMail() {

        String to = "receiver@gmail.com";
        String from = "manish99thawale@gmail.com";
        String password = "APP_PASSWORD";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
        	
        
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
            	
            	{
            		}
            	
                return new PasswordAuthentication(from, password);
            

            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            message.setSubject("Selenium Test Report");
            message.setText("Test executed successfully using Selenium + TestNG");

            Transport.send(message);

            System.out.println("Mail Sent Successfully");

        } catch (Exception e) {
            System.out.println("Mail Failed: " + e.getMessage());
        }
    }
