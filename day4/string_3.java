package utility_1;

public class string_3{
    public static void main(String[] args) {
        String str = "This website is awesome.";
        char ch = 'a';
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}