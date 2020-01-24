package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

// Modificacion para resolver fallos con la clase Time

public final class MyClass {
	
	public void nextTime(final long seconds) {
		final String nextTime = new Time(LocalDateTime.now()).getFutureTime(seconds);
		System.out.println(nextTime);
	}

}
