package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
private int month;
private int day;
private int year;
private boolean holiday;


public Date (int month, int day, int year, boolean holiday) {
	this.month = month;
	this.day = day;
	this.year = year;
	this.holiday = holiday;
}






public String toString() {
	return this.month + "/" + this.day + "/" + this.year;
}

    public static void main(String[] args) {
    	
    	Date a = new Date(11,11,2011,true);
    	Date b = new Date(11,11,2011,false);
    	Date c = new Date(10,10,2010,true);
    	Date d = new Date(10,18,1987,true);
    	Date e = new Date(10,16,2011,true);
    	Date f = new Date(10,16,2011,true);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(a);
    	list.add(b);
    	list.add(c);
    	list.add(d);
    	list.add(e);
    	list.add(f);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(a);
    	set.add(b);
    	set.add(c);
    	set.add(d);
    	set.add(e);
    	set.add(f);
    	System.out.println(set);
    	/*if (a.equals(b)) {
    		System.out.println(true);  
    		
    	}
    	else {
    		System.out.println(false);
    	}*/
    
    }






	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}
}