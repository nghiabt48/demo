import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputString;
        do
        {
            System.out.print("Enter String: ");
            inputString = s.nextLine();
            String str = "";
            char ch;
            for (int i = 0; i < inputString.length(); i++) {
                ch = inputString.charAt(i);
                str = ch + str;
            }
            if(str.equals("N"))
            {
                continue;
            }
            System.out.println("Reversed String: "+str);
        }
        while (!inputString.equals("N"));
    }
}
