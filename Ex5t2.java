import java.util.Scanner;
public class Ex5t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Phrase:");
        String phrase = scanner.nextLine();
        
        String upperCase = phrase.toUpperCase();
        System.out.println("Upper Case:" +upperCase);
        
        String lowerCase = phrase.toLowerCase();
        System.out.println("Lower Case:" +lowerCase);
        
        String replacedPhrase = phrase.replace('a','*');
        System.out.println("Replace a with '*':" +replacedPhrase);
        
        String subString = phrase.substring(2,8);
        System.out.println("Substring 2 to 8:" +subString);
        
        int vowelCount = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char ch = Character.toLowerCase(phrase.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
}
