/*
Задание 1.
Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список.
 */
package homework.HW_4;

import java.util.LinkedList;
import java.util.Random;

public class HW_4_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList<Integer> randList = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            randList.add(rand.nextInt(20));
        }
        System.out.println(randList);
        System.out.println(reverse(randList));
    }
    private static LinkedList<Integer> reverse(LinkedList<Integer> randList) {
        for (int i = 1; i < randList.size(); i++) {
            randList.addFirst(randList.remove(i)); //переворачиваем
        }
        return randList;
    }
}
