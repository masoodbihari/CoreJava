package utility_1;
import java.util.*;
public class pattern {
	public static void main(String args[]){
		//Porgram to find first ten prime and find sum
		int i = 2;
		int total = 0;
		int temp = 0;
		while(temp<10){
			if(i==2){
				System.out.println(i);
				total = total + i;
				temp++;
			}
			else{
				int signal = 0;
				for(int j=2;j<i;j++){
					if(i%j == 0)
						signal++;
				}
				if(signal == 0){
					System.out.println(i);
					total = total + i;
					temp++;
				}
			}
			i++;
		}
		System.out.println("Sum is =" + total);
		int temp1 = 9,space = 4;
		for(int q=0;q<4;q++){
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=-1;k<i;k++)
				System.out.print(temp1 + " ");
			System.out.println();
			space--;
			temp1 = temp1 - 2;
		}
		//program to form a pyramid style stucture
		//   9
		//  7 7
		// 5 5 5
		//3 3 3 3 
		// 5 5 5 
		//  7 7
		//   9
		space = 1;
		temp = 5;
		int upto = 3;
		for(int q=0;q<3;q++){
			for(int j=-1;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<upto;k++){
				System.out.print(temp + " ");
			}
			System.out.println();
			temp = temp + 2;
			space++;
			upto--;
		}
		
	}
}

