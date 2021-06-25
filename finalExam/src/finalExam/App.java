package finalExam;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Message> listOfMessages = new ArrayList<Message>();

		listOfMessages.add(new EmailMessage(new EmailUser("Judy", "Foster", new Address("Main Street", 1), "ab@g.com"),
				new EmailUser("Betty", "Beans", new Address("second street", 2), "vr@g.com"), "This is one email"));

		listOfMessages.add(new SmsMessage(new SmsUser("Judy", "Foster", new Address("Main Street", 1), "1111111111"),
				new SmsUser("Betty", "Beans", new Address("second street", 2), "2222222222"), "This is one sms"));

		try {
			listOfMessages.forEach(mss -> {
				if (mss instanceof EmailMessage) {
					ISendInfo info = new SendEmail();
					if (info.validateMessage(mss.getSender(), mss.getReceiver(), mss.getBody())) {
						info.sendMesage(new Message(mss.getReceiver(), mss.getSender(), mss.getBody()));
					}
				} else if (mss instanceof SmsMessage) {
					ISendInfo info = new SendSms();
					if (info.validateMessage(mss.getSender(), mss.getReceiver(), mss.getBody())) {
						info.sendMesage(new Message(mss.getReceiver(), mss.getSender(), mss.getBody()));
					}
				}
			});
		} catch (Exception exc) {
			System.out.println(exc.getMessage() + " The messages cannot be sent");
		}

		System.out.println("done");
	}
}
