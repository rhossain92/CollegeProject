//Author: Redwan Hossain

import java.util.Arrays;
import java.util.Scanner;

public class Program_Grades {

	public static void main(String[] args) {
		
		int index = 5;
		Scanner input = new Scanner(System.in);
		
		int[] list  = new int[index];
	
		//String variable and input
		String c,t,d ;
		System.out.print("Enter Class name : ");
		c= input.nextLine();
		System.out.print("\nEnter Test name : ");
		t= input.nextLine();
		System.out.print("\nEnter the date : ");
		d= input.nextLine();
	
		//Input array values and sum
		System.out.println("Enter the scores : ");
		
		for (int i = 0; i <index ; i++)
			do{
			list[i] = input.nextInt();	
			}while(list[i]<0 || list[i]>100);
			
		
		//Printing the out of the student details
		System.out.println("Class : " + c);
		System.out.println("Exam : " + t);
		System.out.println("Date : " + d);
		
		System.out.println("Grades: " + Arrays.toString(list));
		System.out.println("Average Grade : " + avg(list));	
		System.out.println("Lowest Grade : " + lowest(list));
		System.out.println("Highest Grade : " + highest(list));
		
		input.close();
	}

	//Finding Lowest Grade of the Exam 
	private static int lowest(int[] list) {
		int min = list[0];
		for (int i=0; i < 5; i++){
			if (list[i]<min)
				min = list[i];
		}
		return min;
	}

	//Finding Highest Grade of the Exam
	private static int highest(int[] list) {
		int max = list[0];
		for (int i=0; i < 5; i++){
			if (list[i]>max)
				max = list[i];
		}

		return max;
	}
	
	//Calculating Average Grade
	private static double avg(int[] list) {
		double sum=0;
		for (int i = 0; i <5 ; i++)
		    sum+= list[i];
		return sum/5;
	}

}