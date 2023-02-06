package seminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями
//вывести название каждой планеты и количество его повторений в списке

public class sem_3_22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        Random random = new Random();
        for (Integer i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) == list.get(i)) {
                count++;
            } else {
                System.out.print(list.get(i));
                System.out.printf("-%s; ", count);
                count = 1;
            }
        }
        System.out.print(list.get(list.size()-1));
        System.out.printf("-%s; ", count);
        
        Set <Integer> numbers = new TreeSet<Integer>(list); // set - отсеял все повторы
        System.out.println(numbers);
    }
}
