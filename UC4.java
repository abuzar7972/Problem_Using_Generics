package com.bl;

public class UC4 {
	public static int findMax(int arr[]){  
	int max=arr[0];//arr[0] instead of 0  
    for(int i=1;i<arr.length;i++){  
        if(max<arr[i])  
            max=arr[i];  
    }  
    return max;  
}  
}
