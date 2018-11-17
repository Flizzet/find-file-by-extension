import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main.
 * 
 * @author Pedro Dutra (2017)
 * @version 1.0
 */
public class Main {
    
    private static String extension;
    private static final String directory = "/Users/Flizzet/Documents/UnityWorkspace/Commando War/";
    

    /** Default instantiable constructor */
    public Main() {}
    
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please type the extension you would like to find: ");
	extension = scanner.nextLine();
	System.out.println("Searching...");
	List<String> filesFound = finder(extension);
	
	for (String s : filesFound) {
	    System.out.println(s);
	}
	
	scanner.close();
    }

    static List<String> finder(String extension) {
	List<String> textFiles = new ArrayList<String>();
	File dir = new File(directory);
	for (File file : dir.listFiles()) {
	    if (file.getName().endsWith((extension))) {
		textFiles.add(file.getName());
	    }
	}
	return textFiles;
    }
}
