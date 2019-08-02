package utility_1;

public class op_4 {
	public static void main(String args[]){
		float marks = 75.0f;
		if(marks >= 75)
			System.out.println("You are in the FCD category");
		else if(marks >= 60 && marks<75)
			System.out.println("You are in the FC category");
		else if(marks>=50 && marks<60)
			System.out.println("You are in the SC category");
		else if(marks >= 35 && marks<50)
			System.out.println("You are in the PC category");
		else
			System.out.println("You have failed");
	}
}
