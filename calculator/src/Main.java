//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public static void main(String[] args) {
    double num3;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter num1: ");
    double num1 = input.nextDouble();

    System.out.println("+/-: ");
    char operator = input.next().charAt(0);

    System.out.println("Enter num2: ");
    double num2 = input.nextDouble();

    switch(operator){
        case '+':
            num3=num1+num2;
            System.out.println("num1 + num2 ="+num3);
            break;
        case '-':
            num3=num1-num2;
            System.out.print("num1 - num2 ="+num3);
            break;
        default:
            System.out.println("Choose +/-");
            break;
    }
    }


