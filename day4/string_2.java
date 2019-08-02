package utility_1;


public class string_2 {
	public static void main(String args[]){
		String str = "Malayalam";
		int length = str.length();
		int vowel = 0,consonent = 0;
		for(int i=0;i<length;i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				vowel++;
			else 
				consonent++;
		}
		System.out.print("vowel :" + vowel + " " + "consonent :" + consonent);
	}
}
