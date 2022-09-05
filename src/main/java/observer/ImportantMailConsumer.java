package observer;

public class ImportantMailConsumer implements MailObservable {
    @Override
    public void executeWhenMailCame(String mail) {
        System.out.println("Important Mail is there");
    }
}
