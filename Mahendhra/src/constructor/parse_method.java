package constructor;

public class parse_method {
	public static void main(String[] args) {
		Byte b =1;
		Short s=10;
		Integer i1=10;
		Long l=10l;
		Float f=10.1f;
		Double d=11.456;
		Character c='g';
		Boolean b1=true;
		String s3="true";
		String s1="0";
		byte b2=Byte.parseByte(s1);
		short s2=Short.parseShort(s1);
		int i2=Integer.parseInt(s1);
		long l2=Long.parseLong(s1);
		float f2=Float.parseFloat(s1);
		double d2=Double.parseDouble(s1);	
		boolean b6=Boolean.parseBoolean(s3);
		//System.out.println(s1);
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(b6);
		
		
	}
}
