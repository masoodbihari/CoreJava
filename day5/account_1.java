package utility_1;

public class account_1 {
	int accountno;
	float accountbal;
	float int_rate;
	public account_1(int accountno){
		this.accountno = accountno;
	}
	public account_1(int accountno,float accountbal,float int_rate){
		this.accountno = accountno;
		this.accountbal = accountbal;
		this.int_rate = int_rate;
	}
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
