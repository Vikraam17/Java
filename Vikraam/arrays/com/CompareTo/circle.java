package com.CompareTo;

public class circle implements Comparable {
	int radius;
	public circle(int r) {
		radius=r;
	}
	@Override
	public int compareTo(Object args) {
		return radius-((circle)args).radius;
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + "]";
	}

}
