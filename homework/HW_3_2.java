/*
Задание 2:
Создать список целых чисел (заполнить случайными числами).
Найти минимальное, максимальное и среднее из этого списка.
 */
package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HW_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(15);
        Random random = new Random();
        for (Integer i = 0; i < 15; i++) {
            list.add(random.nextInt(15));
        }
        System.out.println();
        System.out.printf("Создали список c целыми случайными числами: %s", list);
        System.out.println();
        Collections.sort(list);
        System.out.printf("Для удобства проверки отсортируем список: %s", list);
        System.out.println();

        System.out.println("Минимум равен " + list.get(0));
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("Среднее из этого списка равно " + sum / list.size());  
        System.out.println("Максимум равен " + list.get(list.size() - 1));
    }
}
