package utility_1;

public class op_3 {
	public static void main(String args[]){
		int a = 10,b = 7,c = 9;
		if(a>b){
			if(a>c){
				System.out.println("A is the largest");
			}
			else{
				System.out.println("Both A & C are largest or C is the largest number");
			}
		}
		else{
			if(b>c){
				System.out.println("B is the largest");
			}
			else{
				System.out.println("Both B & C are largest or C is the largest number");
			}
		}
		
	}
}
