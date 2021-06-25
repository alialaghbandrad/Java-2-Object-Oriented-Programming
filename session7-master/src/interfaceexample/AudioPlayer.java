package interfaceexample;

public class AudioPlayer implements IPlay {

	@Override
	public void play() {
		System.out.println("I am an audio player");
	}
	
	@Override
	public void myMethod() {
		System.out.println("I can play everything because I am an audio player");
	}
}
