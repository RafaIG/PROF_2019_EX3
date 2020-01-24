package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// En primer lugar modificamos esta clase para inyectar dependencias

public final class Time {

	private LocalDateTime actualTime;

	public Time(final LocalDateTime time) {
		actualTime = time;
	}

	public String getFutureTime(final long seconds) {
		final LocalDateTime futureTime = actualTime.plusSeconds(seconds);
		return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(futureTime);
	}

}
