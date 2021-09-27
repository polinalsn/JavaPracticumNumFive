import java.util.Scanner;

public class twelve {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Вводим число
        if (n > 0) { // Проверяем условие, при 0 выходим из рекурси
            if (n % 2 == 1) { // Если остаток от деления на 2 равен 1, то число четное
                System.out.println(n); // Отправляем его в поток вывода
                recursion(); // Вызываем рекурсию для нового ввода
            } else {
                recursion(); // Если число четное, ничего не выводим и вызываем рекурсию для нового ввода
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
