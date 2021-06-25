package finalExam;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SendSms implements ISendInfo {

	@Override
	public boolean validateMessage(User sender, User receiver, String body) {

		if (sender instanceof SmsUser && receiver instanceof SmsUser) {
			SmsUser senderUser = (SmsUser) sender;
			SmsUser receiverUser = (SmsUser) receiver;

			if (!validatePhoneNumber(senderUser.getPhoneNumber())
					|| !validatePhoneNumber(receiverUser.getPhoneNumber())) {
				throw new IllegalArgumentException("invalid phone number");
			}
		}
		if (!validateSmsBody(body)) {
			throw new IllegalArgumentException("invalid sms body");
		}
		return true;
	}

	@Override
	public void sendMesage(Message message) {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter("resource/sms.txt"))) {
			printWriter.println(message);
			printWriter.close();
		} catch (IOException e) {
		}
		        
        
	}

	private boolean validatePhoneNumber(String phoneNumber) {
		// google and we could find
		// https://stackoverflow.com/questions/10575624/java-string-see-if-a-string-contains-only-numbers-and-not-letters
		if (phoneNumber.matches("[0-9]+") && phoneNumber.length() == 10) {
			return true;
		}
		return false;

		// OR

		// using regex
//		if (phoneNumber.matches("^\\d{1,10}$")) {
//			return true;
//		}	
	}

	private boolean validateSmsBody(String smsBody) {
		if (smsBody == null) {
			return false;
		}
		if ((smsBody.isEmpty() || smsBody.length() >= 160)) {
			return false;
		}
		if (smsBody.contains("&") || smsBody.contains("#") || smsBody.contains("@")) {
			return false;
		}
		return true;

		// OR REGEX

//		if (Pattern.matches("^.*?[&#@].*?$", smsBody)){
//			return false;
//		}
	}

}
