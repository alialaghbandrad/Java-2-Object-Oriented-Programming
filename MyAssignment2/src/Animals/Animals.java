package Animals;

public abstract class Animals {
	   abstract void sound();
	 }

	 class Dogs extends Animals{
	 void sound(){
	  System.out.println("Dogs bark");
	  }
	 }
	 class Cats extends Animals{
	 void sound(){
	  System.out.println("Cats meow");
	  }
	 }
	 class Monkeys extends Animals{
	 void sound(){
	  System.out.println("Monkeys whoop");
	  }
	 }
	 class abstract1{
	 public static void main(String[] args){
	  Animals d = new Dogs();
	  Animals c = new Cats();
	  Animals m = new Monkeys();
	  d.sound();
	  c.sound();
	  m.sound();
	 }
	}


