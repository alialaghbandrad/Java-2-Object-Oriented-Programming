package finalExam;

public interface ISendInfo {	
	boolean validateMessage(User sender, User receiver, String body);
		
	void sendMesage(Message message);
}


