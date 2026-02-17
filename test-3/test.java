import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your name: ");
        String name = sc.nextLine();
        if (name.equals("shoudo")) {
            System.out.println("hello, " + name + " how are you?");
        } else {
            System.out.println("sorry who are you?");
        }
        sc.close();
    }
}