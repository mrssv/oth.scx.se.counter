package oth.scx.se.counter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CounterTest {
	
	private Counter instance;
	
	@Before
	public void init() {
		instance = new Counter();
	}

	@Test
	@DisplayName("Initial value is 0")
	public void initialZero() {
		assertEquals(0, instance.get());
	}
	
	@Test
	@DisplayName("Incrementing repeatedly and then getting returns updated value")
	public void incrementGet() {
		final int n = 42;
		for (int i = 0; i < 42; i++) {
			instance.increment();
		}
		assertEquals(n, instance.get());
	}
	
	@Test
	@DisplayName("Incrementing, resetting and getting returns 0")
	public void incrementResetGet() {
		instance.increment();
		assertEquals(1, instance.get());
		instance.reset();
		assertEquals(0, instance.get());
	}
	

}
