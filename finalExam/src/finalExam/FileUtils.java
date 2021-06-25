package finalExam;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileUtils {
		
	
	
	public static void fileWriter(Message message) throws IOException {	
        File f = new File("src/resource/"); 
        
        if (f.exists()) {
    		Files.write(Paths.get("src/resource/"), message.toString().getBytes(), StandardOpenOption.APPEND);
        }
        else {
    		Files.write(Paths.get("src/resource/"), message.toString().getBytes(), StandardOpenOption.CREATE);
        }
		
	}
	
	public static List<String> filesReadExample(String type) throws IOException {
		Path path = Paths.get("src/resource/student/" + type);
		return Files.readAllLines(path);
	}
	
}
