package com.Hashing;

public class Student {
		String name;
		int marks;
		public Student(String n,int m) {
			name=n;
			marks=m;
		}
		@Override
		public boolean equals(Object arg) {
			if(!(arg instanceof Student)) return false;
				Student s1=(Student)arg;
				return name.equalsIgnoreCase(s1.name)&&marks==s1.marks;
		}
		@Override
		public int hashCode() {
			return name.hashCode();
		}
		@Override
		public String toString() {
			return "name ="+name+" Marks= "+marks;
		}
}
