package com.singleTonClass;

public class Theater {

	int seat=50;
	private  static Theater t;
	private Theater()
	{
		
	}
	public void BookTicket(int n) {
		if(n>seat) {
			System.out.println("Seat is not available");
		}
		else
		{
			seat-=n;
			System.out.println(n+" Seat is booked");
		}
	}
	public static Theater getInstance() {
		if(t==null) {
			t=new Theater();
			return t;
		}
		else
		{
			return t;
		}
	}

}
