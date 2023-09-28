package oth.scx.se.counter;

/**
 * Instances of this class represent the data model of our website access
 * counter. A counter is a holder of an integer value that tracks the
 * number of accesses to date. The value can be retrieved, incremented
 * and reset by clients.
 */
public class Counter {
	
	/**
	 * How often the website was accessed
	 */
	private int value = 0;
	
	/**
	 * Gets the number of accesses to date
	 * 
	 * @return counter value
	 */
	public int get() {
		System.out.println(value);
		return 0;
	}
	
	/**
	 * Increments the number of accesses by one
	 */
	public void increment() {
		int value = this.value + 1;
	}
	
	/**
	 * Sets the number of accesses back to the default value 0
	 */
	public void reset() {
		boolean result = this.value == 0;
	}

}
