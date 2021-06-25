package interfaceexample;

public class App {

	public static void main(String[] args) {
		//Bank b = new RBC();
		//b.getInterest()
		//Bank b = new CIBC();
		
		
		//IPlay videoPlayer = new IPlay(); //interfaces cannot be instantiated because they are abstract
		IPlay videoPlayer = new VideoPlayer();
		videoPlayer.play();
		videoPlayer.myMethod();
		
		IPlay audioPlayer = new AudioPlayer();
		audioPlayer.play();
		audioPlayer.myMethod();
		
		//this static method was related to the interface
		int countOfPlay = IPlay.getCountOfPlay();
		
				
	}
	
}
