package seminar;

import java.util.ArrayList;
import java.util.LinkedList;

public class sem_4_0 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        ArrayList <Integer> list = new ArrayList<Integer>(10000);
        for (int i = 0; i < 10_000; i++) {
            list.add(1);
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s); 

        LinkedList <Integer> list1 = new LinkedList<Integer>();
        for (int i = 0; i < 10_000; i++) {
            list1.add(1);
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s); 
    }
}
