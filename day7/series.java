package utility_1;

public class series {
	public static void main(String args[]){
		int count = 1;
		for(int i=7;i>0;i--){
			if(i!=1)
				System.out.print(i + "*");
			else 
				System.out.print(i);
			count = count*i;
		}
		System.out.println("= "+ count);
	}
}
