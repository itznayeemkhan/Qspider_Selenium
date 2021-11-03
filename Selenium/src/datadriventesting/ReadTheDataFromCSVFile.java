package datadriventesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadTheDataFromCSVFile {

	public static void main(String[] args) throws CsvValidationException, IOException {
		String filepath = "./resources/CSVDATA.CSV";
		FileReader fileReader = new  FileReader(filepath);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] arr=csvReader.readNext();
		for(String data:arr) {
			System.out.println(data);
		}
		csvReader.close();
		

	}

}
