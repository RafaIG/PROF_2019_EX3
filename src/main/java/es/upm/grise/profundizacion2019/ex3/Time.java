package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// En primer lugar modificamos esta clase para inyectar dependencias

public final class Time {

	private LocalDateTime actualTime;

//	public static String getFutureTime(long seconds) {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
//		LocalDateTime date = (LocalDateTime) formatter.parse("2020/01/01 00:00:00");
//		LocalDateTime time = LocalDateTime.now();
//		time.plusSeconds(seconds);
//		return formatter.format(time);	
//	}

	public Time(final LocalDateTime time) {
		this.actualTime = time;
	}

	public String getFutureTime(final long seconds) {
		final LocalDateTime futureTime = actualTime.plusSeconds(seconds);
		return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(futureTime);
	}

}
