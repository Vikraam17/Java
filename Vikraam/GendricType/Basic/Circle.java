package Basic;

public class Circle implements Comparable<Circle>{
	int radius;
	public Circle(int r) {
		radius = r;
	}
	public int compareTo(Circle arg) {
		return radius - arg.radius;
	}
}
