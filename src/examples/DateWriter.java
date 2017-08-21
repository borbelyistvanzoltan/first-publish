package examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateWriter {
	
	public static void main(String[] args){
				
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime date = LocalDateTime.now();
		date.format(formatter);
				
		if (date.format(formatter)=="2017-08-11") {
			System.out.print("Istvan is on holiday!");
		} else {
			System.out.print("Istvan is working now!");
		}
	}	
}