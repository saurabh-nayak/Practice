package com.saurabh.enumE;

public class EnumExample {
	
	/*enum implicitly converted into final class which extends Enum class implicitly
	 * so enum cannot extend any other class as it already extends Enum class
	 * it can implement interface and provide implementation.
	 * 
	 */
	enum Days {
		//static final references of Days type is created internally
		SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
		int value;
		Days(int value)
		{
			this.value=value;
		}
		int getValue() {
			return value;
		}
	}

	public static void main(String[] args) {

		//can create object of enum
		Days days= Days.FRIDAY;
		System.out.println(days.name());
		System.out.println(Days.SUNDAY.getValue());
		
		//valueOf and values methods given by compiler not available in Enum class.
		System.out.println(Days.valueOf("SUNDAY"));
		for(Days day:Days.values()) {
			//return name of that constant enum.
			System.out.println(day.name());
			//return index of that enum.
			System.out.println(day.ordinal());}
	}

}
