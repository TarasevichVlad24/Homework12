import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int num1 = enterNumber();
        int num2 = enterNumber();
        char operation = selectOperation();
        int result = calculation(num1, num2, operation);
        System.out.println("Результат = " + result);
    }

    public static int enterNumber() {
        System.out.println("Введите число: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы ввели неверное число, повторите ввод");
            scanner.next();
            num = enterNumber();
        }
        return num;
    }

    public static char selectOperation() {
        System.out.println("Выберите операцию +, -, *, /");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку, повторите ввод");
            scanner.next();
            operation = selectOperation();
        }
        return operation;
    }

    public static int calculation(int num1,int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция, попробуйте еще раз");
                result = calculation(num1, num2, operation);

        }
        return result;
    }
}
