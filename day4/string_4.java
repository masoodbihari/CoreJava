package utility_1;

public class string_4{
    public static void main(String[] args) {
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);
        System.out.println("The string is: " + st);
        
        char[] ch1 = {'a', 'e', 'i', 'o', 'u'};
        String st1 = String.valueOf(ch1);
        String st2 = new String(ch1);
        System.out.println(st1);
        System.out.println(st2);
    }
}
