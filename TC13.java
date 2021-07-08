package com.bl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TC13 {
	public static int getThirdLargest(int[] a, int total){  
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
		//TC13 obj =new TC13();
		int z =TC13.getThirdLargest(a, 3);
		System.out.print("Third largest::" +TC13.getThirdLargest(a, 3));
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
