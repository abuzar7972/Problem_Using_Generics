package generics;

public class PrintArray 
{
	public static <T extends Comparable<T>>T maximum(T x, T y, T z)
	{
		T max = x;
		
		if ( y.compareTo(max) > 0) 
				max = y;
		
		if ( z.compareTo(max) > 0)
		        max = z;
		
		return max;
	}
	public static void main(String[] args)
	{
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 8,9,16, maximum(8,9,16));
		System.out.printf("Maximum of %.1f,%.1f and %.1f is %.1f\n\n", 9.0,7.9,6.5, maximum(9.0,7.9,6.5));
		System.out.printf("Maximum of %s,%s and %s is %s\n", "person","dog","bird", maximum("person","dog","bird"));
		
	}
}
