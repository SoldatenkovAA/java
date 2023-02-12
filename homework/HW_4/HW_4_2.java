/*
Задание 2:
Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.
 */
package homework.HW_4;

import java.util.LinkedList;

public class HW_4_2 {
    public static void main(String[] args) {

        int[] list = { 1, 2, 3, 4, 5, 6 };

        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (Integer temp : list) {
            ll.add(temp);
        }
        System.out.println(ll);

        enqueue(ll, 7);
        System.out.println(ll);

        System.out.println(dequeue(ll));
        System.out.println(ll);

        System.out.println(first(ll));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = list.get(0);
        return num;
    }
}
