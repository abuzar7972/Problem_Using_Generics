package com.bl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TC12 {
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		      return a[total-2];  
		}  
	public static int main() {
		int[] a= {23,2,12};
		TC12 obj =new TC12();
		int z =obj.getSecondLargest(a, 3);
		System.out.print("Second largest::" +obj.getSecondLargest(a, 3));
		return z;
	}
	public class test {
		@SuppressWarnings("static-access")
		@Test
		public void check() {
			int num = 12;
			TC12 obj1 = new TC12();
			int num1=obj1.main();
			assertEquals("1 should be equal to 1", num1, num);
		}
	}
}
	
