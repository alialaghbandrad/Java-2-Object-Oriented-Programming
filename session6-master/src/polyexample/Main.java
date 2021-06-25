package polyexample;


class Movie{
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
	//If I don't have default constructor
//	public Movie() {
//		
//	}
	
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
	
}


class Prestige extends Movie{

	public Prestige() {
		super("Prestige");
		//since there is no default(implicit) constructor
//		super();
	}
	
	@Override
	public String plot() {
		return "2 magiciens want to show their talents and it is about grudge and retaliation";
	}
}


class LordOfRings extends Movie{
	
//	public LordOfRings() {
//		super("lord of the rings");
//	}
	
	public LordOfRings(String name) {
		super(name);
	}
	
	@Override
	public String plot() {
		return "Rings, My precious and Hobbits and white horse!!!";
	}
}

class Interstellar extends Movie{
	public Interstellar(String name) {
		super(name);
	}
	
	@Override
	public String plot() {
		return "Time travel, space , nice movie";
	}
}

public class Main {
	
	public static void main(String[] args) {
		Movie movie = randomMovie();
		System.out.println("the name of the movie " + movie.getName() + " the plot is"
				+ movie.plot());
	
	
	}
	
	public static Movie randomMovie() {
		int randomNumber = (int)(Math.random() * 3) + 1;
		System.out.println("the random number generated is " + randomNumber);
		
		//switch case
		switch (randomNumber) {
			case 1:
				return new Prestige();
			case 2:
				return new LordOfRings("lord of the rings");
			case 3:
				return new Interstellar("interstellar");
		}
		return null;
		
	}
	
	
	
	
	
	
	
}
