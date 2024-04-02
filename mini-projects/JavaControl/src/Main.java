import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println(STR."Hello, \{name}");
        System.out.println(STR."You are \{age} years old");
        System.out.println(STR."You like \{food}");

        name = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null, STR."Hello, \{name}");

        age = Integer.parseInt(JOptionPane.showInputDialog("Now enter your age"));
        JOptionPane.showMessageDialog(null, STR."You are \{age} years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height in centimeters"));
        JOptionPane.showMessageDialog(null, STR."You are \{height} cm tall");
    }
}