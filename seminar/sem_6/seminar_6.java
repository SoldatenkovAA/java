package seminar.sem_6;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class seminar_6 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в систему котов!");
        System.out.println("Меню: \n Нажмите 1, чтобы вывести породы всех котов; \n Нажмите 2 для поиска");
        Scanner iScanner = new Scanner(System.in, "cp866");
        int userInput = iScanner.nextInt();

        HashSet <cat> catSet = new HashSet <cat>();

        cat cat1 = new cat("Игорь", 14, "green", "british", "m", false, 12344);
        //System.out.println(cat1.printCat());
        cat cat2 = new cat("Василиса", 44, "brown", "siberian", "f", true, 12345);
        //System.out.println(cat2.printCat());
        cat cat3 = new cat("Евгений", 2, "black", "russian", "m", true, 12347);
        //System.out.println(cat3.printCat());

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);

        

        switch (userInput) {
            case 1:
            for (cat cat : catSet) {
                System.out.println(cat.breed);
            }
                break;
            case 2:
                System.out.println("Введите пол кота для поиска (f/m): ");
                String genderInput = iScanner.next();
                List<cat> queryCat = cat3.findCat(catSet, genderInput);
                for (cat pupa : queryCat) {
                System.out.println(pupa.printCat());
            }
                break;
            default:
                System.out.println("Ошибка при вводе команды");
                return;
        }
    }
}
