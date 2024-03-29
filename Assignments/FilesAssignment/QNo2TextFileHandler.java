package day7workingwithfilesassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QNo2TextFileHandler {

	public static void main(String[] args) {
		Map<String, String> countryMap =new HashMap<String, String>();
		try {
			File file = new File("D:\\prodapt\\output\\country.csv");
			FileReader     fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			
			while((line=br.readLine())!=null) {
				String[] country_capital = line.split(",");
				countryMap.put(country_capital[0], country_capital[1]);
			}
			br.close();
			fr.close();
			
			System.out.println("Countries and their Capitals");
			for(Map.Entry<String, String> entry : countryMap.entrySet()) {
				System.out.println(entry.getKey() + " - " + entry.getValue()) ;
			}
		}catch(FileNotFoundException e){
			System.out.println("File Doesn't Exists");
			
		}
		catch(IOException ie) {
			System.out.println("IO Exception while reading the content");
		}
	}

}
