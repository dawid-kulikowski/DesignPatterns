package observer;

public class MailConsumer implements MailObservable {
    @Override
    public void executeWhenMailCame(String mail) {
        System.out.println(mail);
    }
}
