package seminar;

import java.util.ArrayList;
import java.util.Scanner;

public class sem_3_4 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Укажите жанр: ");
        String genre = iScanner.nextLine();
        System.out.print("Укажите название книги: ");
        String book = iScanner.nextLine();
        System.out.print("Укажите жанр: ");
        String genre2 = iScanner.nextLine();
        System.out.print("Укажите название книги: ");
        String book2 = iScanner.nextLine();
        
        ArrayList<String> list = new ArrayList<String>();
        list.add(genre);
        list.add(book);
        list.add(genre2);
        list.add(book2);
        
        System.out.println(list);
        matrix.add(list);
        System.out.print(matrix);
    }
}
