import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    public static void main(String[] args) throws Exception {
        List<String> greekNames = new ArrayList<>();


        // добавлил10 имен, из них 2 повторяющихся
        greekNames.add("Алкмена");
        greekNames.add("Атанасия");
        greekNames.add("Аполония");
        greekNames.add("Вазилики");
        greekNames.add("Аполония");
        greekNames.add("Доркас");
        greekNames.add("Доркас");
        greekNames.add("Зозим");
        greekNames.add("Зона");
        greekNames.add("Исис");

        // просто для лучшего чтения результатов
        System.out.println("..............................");


        List<String> list = new ArrayList<String>(greekNames);

        // имена в строчку
        for ( String v: list)
            System.out.print(v +", ");

        // ждя подсчета имен использую HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();


        // инициализация счетчика
        Integer item;
        // прогоняю по циклу ArrayList и
        // закидываю имена в HashMap как ключ, а значение(Value) создаю или увеличиваю на 1
        for (String wrd : list) {
            item = hm.get(wrd);
            if (item == null) hm.put(wrd, 1); // если нет в списке то добавить со значением 1
            else hm.put(wrd, item + 1); // если есть такое имя(Key), то +1
        }


        System.out.println(" ");
        System.out.println("Всего имен в списке: " + greekNames.size());
        System.out.println("Всего уникальных имен в списке: " + hm.size());
        System.out.println("Имена и колличество раз их упоминания:");
        System.out.println(hm);

        System.out.println(".........................................................");
        System.out.println(hm.values());



    }
}