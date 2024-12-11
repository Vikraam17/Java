package com.Interview;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		String s="{[]}";
		System.out.println(isbalaced(s));
	}
	public static boolean isbalaced(String s) {
		char[] ch=s.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<ch.length;i++) {
			char ch1=ch[i];
			if(ch1=='{'||ch1=='[' ||ch1=='(') {
				stack.push(ch1);
			}
			else if(ch1=='}'|ch1==']'||ch1==')' ) {
				if(!stack.isEmpty()) {
					char ch2=stack.pop();
					if(!isPair(ch2,ch1)) {
						return false;
					}
				}
				else {
					return !stack.isEmpty();
				}
			}
		}
		return !stack.isEmpty();
	}
	public static boolean isPair(char ch1,char ch2) {
		if((ch1=='['&&ch2==']') || (ch1=='{'&&ch2=='}')||(ch1=='('&&ch2==')')) {
			return true;
		}
		else {
			return false;
		}
	}

}
