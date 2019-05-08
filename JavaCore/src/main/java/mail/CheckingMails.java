package mail;

import javax.mail.*;
import java.io.*;
import java.util.Properties;

/**
 * Created by AtagaN on 18.02.2019.
 */
public class CheckingMails {

    public static void main(String[] args) throws IOException {

        String host = "pop.rambler.ru";// change accordingly
        String mailStoreType = "pop3";
        String username = "atagan@rambler.ru";// change accordingly

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INPUT PASSWORD");
        String password = reader.readLine();

        reader.close();

        check(host, mailStoreType, username, password);
    }


    public static void check(String host, String storeType, String user, String password) {
        try {
            //create properties field
            Properties properties = new Properties();

            properties.put("mail.pop3.host", host);
            properties.put("mail.pop3.port", "995");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3s");

            store.connect(host, user, password);

            //create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length:  " + messages.length);

            for (int i = 0; i < messages.length; i++) {
                Message message = messages[i];
                System.out.println("===================================================================================" +
                "======================================================================================================");
                System.out.println("Email Number " +  message.getMessageNumber());
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());

                //сохранить письмо
                if (i == 100) {
                    FileOutputStream fileOutputStream = new FileOutputStream("MyEmail.eml");
                    message.writeTo(fileOutputStream);
                    fileOutputStream.close();
                }

            }

            //close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}