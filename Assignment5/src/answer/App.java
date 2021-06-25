package answer;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
        Dancer dancer = new Dancer("Fred", 18);

        Dancer breakdancer = new Breakdancer("Jay", 19); // Widening conversion to the base type
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Marcia", 20); // Widening conversion to the base type

        List<Dancer> disco = Arrays.asList(dancer, breakdancer, electricBoogieDancer);
        for (Dancer d : disco) {
            d.dance(); // Call the polymorphic method
        }
    }
}
