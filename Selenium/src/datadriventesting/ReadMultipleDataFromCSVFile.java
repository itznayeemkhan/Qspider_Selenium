package datadriventesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadMultipleDataFromCSVFile {

	public static void main(String[] args) throws CsvValidationException, IOException {
		String filepath = "./resources/csvdata1.CSV";
		FileReader fileReader = new  FileReader(filepath);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] arr=csvReader.readNext();
		while(arr!=null) {
			for(String data:arr) {
			System.out.println(data);
		}
		arr=csvReader.readNext();

	}
	csvReader.close();

}
}
