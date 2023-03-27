package assignment6;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Destination
{
	int actualTime,remainingTime,holidays,days,currentDayRemaining;
	
	LocalDateTime dt = LocalDateTime.now();
	DayOfWeek day = dt.getDayOfWeek();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public Destination(LocalDateTime dt)
	{
		this.dt=dt;
	}
	boolean isHoliday(LocalDateTime d)
	{
		return(dt.getDayOfWeek() == DayOfWeek.SUNDAY
				||dt.getDayOfWeek() == DayOfWeek.SATURDAY)&&(dt.getDayOfMonth()>7&&dt.getDayOfMonth()<=15)
				||(dt.getMonthValue() == 1 && d.getDayOfMonth() ==26)
				||(dt.getMonthValue() == 8 && d.getDayOfMonth() ==15)
				||(dt.getMonthValue() == 1 && d.getDayOfMonth() ==1);

	}
	void findArrivalTime(int distance,int speed)
	{
		actualTime=distance/speed;
		remainingTime= actualTime % 8;
		
		currentDayRemaining =23 - dt.getHour();
		
		if(currentDayRemaining<8)
		{
			System.out.println("Starting date"+dt.plusDays(1).format(format));
		}
		else
		{
			System.out.println("Starting date"+dt.format(format));
		}
		while((actualTime/8) > days)
		{
			dt =dt.plusDays(1);
			
			if(isHoliday(dt))
			{
				holidays++;
			}
			days++;
		}
		dt = dt.plusDays(holidays).plusHours(remainingTime);
		
		System.out.println("Arival date:" + dt.format(format));
	}
}