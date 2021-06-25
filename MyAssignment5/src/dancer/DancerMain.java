package dancer;

public class DancerMain {

		public static void main(String[] args) {
			Dancer[] dancers = new Dancer[]
					{new Dancer("Brian", 23), new ElectricBoogieDancer("Lia", 15), new Breakdancer("Philip", 31)};
			for (int i = 0; i < dancers.length; i++)	{
				EnterDanceContest(dancers[i]);
			}
		}
		public static void EnterDanceContest(Dancer nextDancer) {
			String dancerInfo = nextDancer.dance();
			System.out.println("Name: " + next.Dancer.getName() + "Age: " + nextDancer.getAge() + " are our dancers");
		}
}

