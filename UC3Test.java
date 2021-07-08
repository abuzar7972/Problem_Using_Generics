package com.bl;

public class UC3Test<T> {
	private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }
	   public static void main(String[] args) {
		   UC5Test<String> stringBox = new UC5Test<String>();
		   stringBox.add(new String("Hello World"));
		   System.out.printf("String Value :%s\n", stringBox.get());
	   }

}
