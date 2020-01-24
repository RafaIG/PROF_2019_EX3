package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import org.mockito.*;

import org.junit.Test;

public class smokeTest {

	private final static long SECONDS = 120L;

	/**
	 * Prueba nextTime de MyClass
	 * 
	 * Tiene que devolver: 2020/01/01 00:02:00
	 */
	@Test
	public void testTime() {
		Time time = new Time(LocalDateTime.of(2020, 1, 1, 0, 0, 0));
		assertEquals("2020/01/01 00:02:00", time.getFutureTime(SECONDS));
	}

	/**
	 * Prueba de interaccion donde solo se llama a getFutureTime una vez
	 * 
	 */
	@Test
	public void testInteraction() {
		final Time timeMock = mock(Time.class);
		final MyClass my = new MyClass(timeMock);
		my.nextTime(SECONDS);
		verify(timeMock, times(1)).getFutureTime(anyLong());
	}

}
