package finalExam;

public class Message {
	private User receiver;
	private User sender;
	private String body;
	
	
	public Message(User sender, User receiver, String body) {
		this.receiver = receiver;
		this.sender = sender;
		this.body = body;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Message [receiver=" + receiver + ", sender=" + sender + ", body=" + body + "]";
	}
	
	
}
