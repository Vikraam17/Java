package constructor;
class employee{
	String name;
	int id;
	long phn_no;
	employee(String name, int id, long phn_no) {
		super();
		this.name = name;
		this.id = id;
		this.phn_no = phn_no;
	}
}
public class emp {
	public static void main(String[] args) {
		employee e=new employee("viky",101,9876543210l);
	}
}
