import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class SolarSystem {
    // Метод добавления элемента в список
    static void add_to_list(String text, List a){
        a.add(text);
    }
    // Метод удаления элемента из списка по индексу
    static void delete_in_list(String text, List a){
        a.remove(a.indexOf(text));
    }
    // Метод вставки в список
    static void set_to_list(int num, String text, List a){
        a.set(num, text);
    }
    // Метод перемешивания списка
    static void shuffle_list(List a){
        Collections.shuffle(a);
    }
    // Метод получения случайного элемента
    static void rand_element_list(List a){
        var random = new Random();
        int randomIndex = random.nextInt(a.size());
        var randomElement = a.get(randomIndex);
        System.out.println("Случайный элемент - " + randomElement);
    }
    // Метод вывода индекса элемента
    static void show_element_index(String text, List a){
        System.out.println(text + " его индекс - " + a.indexOf(text));
    }
    // Метод поиска элемента в списке
    static void find(String text, List a){
        var buff = a.indexOf(text);
        if (buff >= 0)
            System.out.println(text + " найден с индексом " + buff);
        else
            System.out.println("Элемент не найден");
    }
    // Метод переворота списка
    static void reverse_out(List a){
        System.out.println("Прямой порядок: " + a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println("Обратный порядок" + a);
    }

    static public void main(String [] args){
        String buff;
        List<String> solar_sys = new ArrayList<>();
        List<String> um_solar_sys = Collections.unmodifiableList(solar_sys);
        buff = "Земля";
        add_to_list(buff, solar_sys);
        buff = "Меркурий";
        add_to_list(buff, solar_sys);
        buff = "Марс";
        add_to_list(buff, solar_sys);
        buff = "Сириус";
// Работает только для модифицируемого списка
        add_to_list(buff, solar_sys);
        try {
            add_to_list(buff, um_solar_sys);
        }
        catch (Exception e){
            System.out.println("Обнаружена ошибка: попытка добавить элемент в не модифицируемый список");
        }
// Работает только для модифицируемого списка
        delete_in_list("Сириус", solar_sys);
        try {
            delete_in_list("Сириус", solar_sys);
        }
        catch (Exception e){
            System.out.println("Обнаружена ошибка: попытка удалить элемент из не модифицируемого списка");
        }
// Работает только для модифицируемого списка
        set_to_list(0,"Земля2", solar_sys);
        try{
            set_to_list(1, "Меркурий2", um_solar_sys);
        }
        catch (Exception e){
            System.out.println("Обнаружена ошибка: попытка заменить элемент в не модифицируемого списке");
        }
// Работает только для модифицируемого списка
        shuffle_list(solar_sys);
        try{
            shuffle_list(um_solar_sys);
        }
        catch (Exception e){
            System.out.println("Обнаружена ошибка: попытка перемешать не модифицируемый список");
        }
// Работает для обоих списков
        rand_element_list(solar_sys);
        rand_element_list(um_solar_sys);
// Работает для обоих списков
        show_element_index("Марс", solar_sys);
        show_element_index("Марс", um_solar_sys);
// Работает для обоих списков
        find("Меркурий", solar_sys);
        find("Меркурий", um_solar_sys);
// Работает только для модифицируемого списка
        reverse_out(solar_sys);
        try {
            reverse_out(um_solar_sys);
        }catch (Exception e){
            System.out.println("Обнаружена ошибка: попытка развернуть не модифицируемый список");
        }
    }
}