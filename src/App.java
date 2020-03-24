import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String text = scanner.nextLine();
        System.out.print("Enter character want to find:");
        String check = scanner.nextLine();
        int count = 0;
        for(int i=0;i<text.length();i++){
            if((int)text.charAt(i) == (int)check.charAt(0)){
                count++;
            }

        }
        System.out.println(check+" appear "+count+" time.");
    }
}