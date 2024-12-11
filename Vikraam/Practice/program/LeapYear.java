package program;

public class LeapYear {

	public static void main(String[] args) {
		int st=1;
		int end=110;
		for(int i=st;i<=end;i++) {
			if((i%4==0&&i%100!=0)||(i%400==0)) {
				System.out.println(i);
			}
		}
	}
}
