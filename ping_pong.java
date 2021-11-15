import java.util.concurrent.Phaser;

class ping_Pong{
    static final Phaser p = new Phaser(1); // Класс Phaser из библиотеки concurrent с синхронизаторами - позволит нам синхронизировать работу двух потоков

    private static void threadMSG(final String msg) { // Создание потока передачи фразы
        new Thread(() -> { // Thread - создаем поток, запись ()-> заменяет интерфейс run()
            //while (true) // Если убрать комментарии со строк 7 и 10, можно убедиться, что при бесконечном выводе потоки действительно дожидаются друг друга
            System.out.println(msg); // Вывод переданного текста
            p.awaitAdvance(p.arrive() + 1); // Метод awaitAdvance из Phaser нужен для отслеживания момента завершения работы потока и начала фазы работы следующего
            //}
        }).start();
    }

    public static void main(String[] args) {
        threadMSG("ping"); // Вызываем ping
        threadMSG("pong"); // Вызываем pong
    }
}