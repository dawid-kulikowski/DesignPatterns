package observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        observer.MailService mailService = new observer.MailService();

        mailService.registerObserver(new MailConsumer());
        mailService.registerObserver(new ImportantMailConsumer());

        mailService.getAllMails();
    }
}
