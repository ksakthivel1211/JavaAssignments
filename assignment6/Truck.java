package assignment6;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Truck {

	public static void main(String[] args) {
		int distance,speed;
		LocalDate Date;
		LocalTime Time;
		LocalDateTime dateTime;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Distance:");
			distance = scanner.nextInt();
			
			System.out.println("Speed:");
			speed=scanner.nextInt();
			
			System.out.println("Starting Date of truck :");
			Date=LocalDate.parse(scanner.next());//2023-03-21
			
			System.out.println("Starting time of truck:");
			Time=LocalTime.parse(scanner.next());//11:04:44
			
			dateTime = LocalDateTime.parse(Date+"T"+Time);
			Destination dest = new Destination(dateTime);
			dest.findArrivalTime(distance,speed);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

