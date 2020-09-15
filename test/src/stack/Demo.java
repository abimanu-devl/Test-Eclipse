package stack;

import java.util.Scanner;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> abc=new Stack<String>();
		
		try {
			for(int i=0;i<3;i++) {
			
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Value :");
				String val=sc.next();
				abc.add(val);
			}
		}catch(Exception e) {
			
			System.out.println("Invalid Input");
			e.printStackTrace();
			
			
		}
		
		String[] arry=new String[abc.size()];
		abc.toArray(arry);
		
		for(int i=0;i<arry.length;i++) {
			
			
			System.out.println(arry[i]);
			
		}

	}

}
