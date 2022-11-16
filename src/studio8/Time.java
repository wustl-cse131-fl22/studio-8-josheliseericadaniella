package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean military;
	
	/**
	 * @param hour the hour of time
	 * @param minute the minute of time
	 */
	public Time(int hour, int minute, boolean military) {
		this.hour = hour;
		this.minute = minute;
		this.military = military;
	}

	public String toString() {
		if (military) {
			return this.hour + ":" + this.minute;
		}
		else {
			if (hour > 12) {
				return (this.hour-12) + ":" + this.minute;
		}
			else {
				return this.hour + ":" + this.minute;
			}
		}
			
		
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, military, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && military == other.military && minute == other.minute;
	}

	public static void main(String[] args) {
		System.out.print(new Time(15, 43, false).toString());
    	Time a = new Time(15,43,false);
    	Time b = new Time(15,43,true);
    	if (a.equals(b)) {
    		System.out.println(true);  
    		
    	}
    	else {
    		System.out.println(false);
    	}
    	
    }

}