package basicprograms;
import java.util.Scanner;
public class vowelorconsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");
        char c = scanner.next().charAt(0);

        c = Character.toLowerCase(c);  

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a Vowel");
        } else {
            System.out.println(c + " is a Consonant");
        }
    }
}
