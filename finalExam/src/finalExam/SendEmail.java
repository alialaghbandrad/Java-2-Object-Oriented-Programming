package finalExam;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SendEmail implements ISendInfo {

	@Override
	public boolean validateMessage(User sender, User receiver, String body) {
		if (sender instanceof EmailUser && receiver instanceof EmailUser) {
			EmailUser s = (EmailUser) sender;
			EmailUser r = (EmailUser) receiver;
			
			if (!validateEmail(s.getEmailAddress()) || !validateEmail(r.getEmailAddress())) {
				throw new IllegalArgumentException("email addresses are not valid");
			}
		}
		
		if(!validateEmailBody(body)) {
			throw new IllegalArgumentException("email body is not valid");
		}
		return true;
	}

	@Override
	public void sendMesage(Message message) {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter("resource/email.txt"))) {
			printWriter.println(message);
			printWriter.close();
		} catch (IOException e) {
		}

	}
	
	
	private boolean validateEmail(String email) {
		int countofDot = 0;
		int countOfAt= 0;
		for(int i= 0 ;i< email.length(); i++) {
			if(email.charAt(i) == '.') {
				countofDot++;
			}
			if(email.charAt(i) == '@') {
				countOfAt++;
			}
		}
		if(countofDot != 1  || countOfAt != 1) {
			return false;
		}
		
		return true;

		// OR

		// using regex
//		if (email.matches("^(.+)@(.+)\\.(.+)$")) {
//			return true;
//		}	
	}

	private boolean validateEmailBody(String emailBody) {
		if (emailBody == null) {
			return false;
		}
		if ((emailBody.isEmpty())) {
			return false;
		}
		if (emailBody.contains("^") || emailBody.contains("*") || emailBody.contains("!")) {
			return false;
		}
		return true;

		// OR REGEX

//		if (Pattern.matches("^.*?[(\\^)(\\*)(\\!)].*?$", smsBody)){
//			return false;
//		}
	}

}
