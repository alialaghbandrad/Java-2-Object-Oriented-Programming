package Assignment8;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Address> addressList = new ArrayList<Address>();
        addressList.add(new Address(712, "York St", "Toronto", "Ontario", "Y2R7D2"));
        addressList.add(new Address(51, "North St", "Hamilton", "Ontario", "K9X8H2"));
        addressList.add(new Address(4190, "Jones St", "Ottawa", "Ontario", "C1J6A5"));
        addressList.add(new Address(1002, "Panier", "Quebec", "Quebec", "L0E8M8"));
        addressList.add(new Address(77789, "Peel", "Montreal", "Quebec", "H5S7F3"));

        writeToFile( addressList );
        ReadFromFile();

    }

        public static void writeToFile(ArrayList<Address> addressList ) throws IOException {
        try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("src/resource/Mytext"))) {
           String list = addressList.toString();
            myWriter.write( list);
            myWriter.close();
        }catch (IOException e){
           throw e;
        }
    }
    public static void ReadFromFile( ) throws IOException {
        try (BufferedReader myReader = new BufferedReader(new FileReader("src/resource/Mytext"))) {
          Stream<String> content =  myReader.lines();
            content.forEach(row -> System.out.println(row));

        }catch (IOException e){
            throw e;
        }
    }
}

