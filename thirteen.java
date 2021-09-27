import java.util.Scanner;

public class thirteen {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Вводим число в последовательности
        if (n > 0) { // Проверяем, если 0 выходим из рекурсии, иначе
            System.out.println(n); // Отправляем в поток вывод текущее число - оно нечетное по счету
            int m = in.nextInt(); // Вводим следующие число в последовательности, оно будет четным по счету
            if (m > 0) { // Если следующие число 0, выходим из рекурсии, иначае
                recursion(); // Вызываем функцию для ввода нового нечетного по номеру числа
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
