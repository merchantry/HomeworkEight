import java.util.Scanner;
public class homeworkEight {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inster a new string:");
        String mainString = scan.nextLine();
        reverseString(mainString);
        scan.close();
    }
    static void reverseString (String example) {
        for (int stringIndex = example.length() - 1; stringIndex >= 0; stringIndex -= 2) {
            System.out.print(example.charAt(stringIndex) + " ");
        }
    }
}
