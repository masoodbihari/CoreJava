package utility_1;

public class account {
	int accountno;
	float accountbal;
	float int_rate;
	public String get_account_det(){
		String str = "Account Number : " + accountno + "\n"
				+ "Account Balance : " + accountbal + "\n"
				+ "Interest Rate : " + int_rate;
		return str;
	}
	public float calculateInterest(float amt){
		return amt * int_rate/100;
	}
}
