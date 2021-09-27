import java.util.Scanner;

public class fourteen {
    public static String recursion(int n) {
        if (n < 10) { // Если число однозначное
            return Integer.toString(n); // преобраузем число в строку и вернем его как ответ
        }
        else {
            return recursion(n / 10) + " " + n % 10; // Вызываем рекурсию для числа, без последней цифры добавляем пробел и убранную цифру
            // Получится как (145)->(14 5)->(1 4 5)
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N...");
        int N = in.nextInt();
        System.out.println(recursion(N));
    }
}
