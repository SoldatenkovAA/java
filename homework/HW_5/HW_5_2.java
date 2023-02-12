/*
Задание 2.
Пусть дан список сотрудников:
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Иван Савин
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
Иван 4, ...
 */
package homework.HW_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class HW_5_2 {
    public static void main(String[] args) {
        String allNames = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] namesArr = allNames.split(", ");
        HashMap<String, Integer> names = new HashMap<String, Integer>();
        for (String name : namesArr) {
            String[] wholeName = name.split(" ");
            if (names.containsKey(wholeName[0])) {
                names.put(wholeName[0], names.get(wholeName[0]) + 1);
            } else {
                names.put(wholeName[0], 1);
            }
        }
        List<Integer> elements = new ArrayList<Integer>(names.values());
        elements.sort(Collections.reverseOrder());
        HashMap<String, Integer> namesSort = new LinkedHashMap<String, Integer>();
        for (int item : elements) {
            for (String name : names.keySet()) {
                if (item == names.get(name)) {
                    namesSort.put(name, item);
                }
            }
        }
        System.out.println(namesSort);
    }
}
