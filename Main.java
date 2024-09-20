import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = sc.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
    }
    static String calc(String input) {
                String[] parts = input.split(" ");
                if (parts.length != 3) {
                    throw new
                            IllegalArgumentException("Неверный формат выражения!");
                }
        int a = Integer.parseInt(parts[0]);
        String operation = parts[1];
        int b= Integer.parseInt(parts[2]);
        String[] array = input.split(" ");


        if (a<1||a>10||b<1||b>10) {
            return "Ошибка, числа не входят в диапазон от 1 до 10";
        }
        switch (operation) {
            case "+":
                return String.valueOf(a + b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                return String.valueOf(a * b);
            case "/":
                return (b == 0) ? "Ошибка: деление на ноль." : String.valueOf(a / b);
            default:
                return "Ошибка: неверная операция. Используйте +, -, *, /.";
        }


    }
}
