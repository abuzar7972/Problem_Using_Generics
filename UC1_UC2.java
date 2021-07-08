package com.bl;

public class UC1_UC2 {
	public int maxInt(int xI) {
		int a=10;
		int b=20;
		int c=5;
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	public float maxFloat(float xF) {
		float a=10;
		float b=20;
		float c=5;
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return (int) b;
		}
		else {
			return (int) c;
		}
	}

}
