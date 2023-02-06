/*
Задание 1.
Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.
 */
package homework;

import java.util.ArrayList;
import java.util.Random;

public class HW_3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(15);
        Random random = new Random();
        for (Integer i = 0; i < 15; i++) {
            list.add(random.nextInt(15));
        }
        System.out.println();
        System.out.printf("Создали список c целыми случайными числами: %s", list);
        System.out.println();

        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else
                i++;
        }
        System.out.printf("Удалили все четные числа из списка: %s", list);
        System.out.println();
    }
}
