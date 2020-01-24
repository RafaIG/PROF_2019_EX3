package es.upm.grise.profundizacion2019.ex3;

// 1 Modificacion para resolver fallos con la clase Time
// 2 Anadimos dependencias

public final class MyClass {

	private Time actualTime;

	public MyClass(final Time time) {
		actualTime = time;
	}

	public void nextTime(final long seconds) {
		final String futureTime = actualTime.getFutureTime(seconds);
		System.out.println(futureTime);
	}

}
