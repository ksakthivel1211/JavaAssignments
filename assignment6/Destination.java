package assignment6;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Destination
{
	int actualTime,remainingTime,holidays,days,currentDayRemaining;
	
	LocalDateTime localDateTime = LocalDateTime.now();
	DayOfWeek day = localDateTime.getDayOfWeek();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public Destination(LocalDateTime localDateTime)
	{
		this.localDateTime=localDateTime;
	}
	boolean isHoliday(LocalDateTime dates)
	{
		return(localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY
				||localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY)&&(localDateTime.getDayOfMonth()>7&&localDateTime.getDayOfMonth()<=15)
				||(localDateTime.getMonthValue() == 1 && dates.getDayOfMonth() ==26)
				||(localDateTime.getMonthValue() == 8 && dates.getDayOfMonth() ==15)
				||(localDateTime.getMonthValue() == 1 && dates.getDayOfMonth() ==1);

	}
	void findArrivalTime(int distance,int speed)
	{
		actualTime=distance/speed;
		remainingTime= actualTime % 8;
		
		currentDayRemaining =23 - localDateTime.getHour();
		
		if(currentDayRemaining<8)
		{
			System.out.println("Starting date"+localDateTime.plusDays(1).format(format));
		}
		else
		{
			System.out.println("Starting date"+localDateTime.format(format));
		}
		while((actualTime/8) > days)
		{
			localDateTime =localDateTime.plusDays(1);
			
			if(isHoliday(localDateTime))
			{
				holidays++;
			}
			days++;
		}
		localDateTime = localDateTime.plusDays(holidays).plusHours(remainingTime);
		
		System.out.println("Arival date:" + localDateTime.format(format));
	}
}