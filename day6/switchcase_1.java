package utility_1;

public class switchcase_1 {
	public static void main(String args[]){
		int n = 3972;
		while(n>0){
			int temp = n%10;
			n = n/10;
			switch (temp){
				case 2:
					System.out.println("2");
					break;
				case 3:
					System.out.println("3");
					break;
				case 9:
					System.out.println("7");
					break;
				case 7:
					System.out.println("9");
					break;
			}
		}
	}
}
