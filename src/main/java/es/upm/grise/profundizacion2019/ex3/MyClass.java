package es.upm.grise.profundizacion2019.ex3;

// Modificacion para resolver fallos con la clase Time

public final class MyClass {
	
	private Time actualTime;

	// Un constructor que inyecta la dependencia
	public MyClass(final Time time) {
		this.actualTime = time;
	}
	
	public void nextTime(final long seconds) {
		final String nextTime = actualTime.getFutureTime(seconds);
		System.out.println(nextTime);
	}

}
