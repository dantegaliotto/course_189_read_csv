package course_189_read_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\products.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				String[] products = line.split(",");
				for (String p : products)
					System.out.println(p);
				line = br.readLine();
			}

			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		

	}

}
