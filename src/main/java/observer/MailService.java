package observer;

import java.util.ArrayList;
import java.util.List;

public class MailService {
    public final List<MailObservable> mailObservables = new ArrayList<>();

    public void getAllMails() throws InterruptedException {
        while (true) {
            Thread.sleep(5000);

            for (MailObservable mailObservable : mailObservables) {
                    mailObservable.executeWhenMailCame("Mail is there");
            }
        }
    }

    public void registerObserver(MailObservable mailObservable) {
        mailObservables.add(mailObservable);
    }
}
