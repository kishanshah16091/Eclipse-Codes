package com.syntax.projectTask;

public class pp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={{12,43,57,66,69,84},{34,64,74,34},{45,78,57}};
		int oddSum=0,evenSum=0;
		for(int i=0; i<arr.length; i++){
		if(arr[i][evenSum]%2==0){
		evenSum=evenSum+arr[i];
		}
		else{
		oddSum=oddSum+arr[i];
		}
		}
		System.out.println("\nSum of even is: "+evenSum);
		System.out.println("\nSum of odd is: "+oddSum);
	}

}
