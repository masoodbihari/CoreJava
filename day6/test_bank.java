package utility_1;

public class test_bank {
	public static void main(String args[]){
		bank b;
		b = new ICICIBank();
		b = new CitiBank();
		System.out.println("ICICI Rate of Interest :" + b.get_roi());
		System.out.println("Citi Rate of Interest :" + b.get_roi());
	}
}
