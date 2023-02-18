package homework.HW_6;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class head {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в каталог ноутбуков!");
        System.out.println(
                "Выберите действие: \n 1 - печать всех товаров; \n 2 - для поиска по каталогу; \n 3 - выбор по цвету; \n 0 - для выхода");
        Scanner iScanner = new Scanner(System.in, "cp866");
        int userInput = iScanner.nextInt();

        HashSet<notebooks> notebooksSet = new HashSet<notebooks>();

        notebooks notebooks1 = new notebooks(100, "Samsung", "G-100", "black", 16, 1000, "Windows", 2100);
        notebooks notebooks2 = new notebooks(101, "Asus", "M-60", "black", 16, 500, "Windows", 1600);
        notebooks notebooks3 = new notebooks(102, "Mac", "LP20H", "silver", 16, 250, "MacOS", 3200);
        notebooks notebooks4 = new notebooks(103, "Philips", "810ic", "black", 8, 500, "Linux", 2000);
        notebooks notebooks5 = new notebooks(104, "Asus", "M-80", "silver", 32, 1000, "Windows", 1900);

        notebooksSet.add(notebooks1);
        notebooksSet.add(notebooks2);
        notebooksSet.add(notebooks3);
        notebooksSet.add(notebooks4);
        notebooksSet.add(notebooks5);

        switch (userInput) {
            case 0:
                System.out.println("Выход из системы");
                break;
            case 1:
                for (notebooks notebooks : notebooksSet) {
                    System.out.println(notebooks.printnotebooks());
                }
                break;
            case 3:
                System.out.println("Введите цвет монитора для поиска - silver/black): ");
                String usInput = iScanner.next();
                List<notebooks> querynotebooks = notebooks5.findnotebooks(notebooksSet, usInput);
                for (notebooks pupa : querynotebooks) {
                System.out.println(pupa.printnotebooks());
        }
            break;
            case 2:
                System.out.println(
                        "Введите цифру, соответствующую критерию поиска: \n 1 - RAM \n 2 - объем HD \n 3 - операционная система \n 4 - цвет");
                int paramInput = iScanner.nextInt();
                switch (paramInput) {
                    case 1:
                        for (notebooks notebooks : notebooksSet) {
                            System.out.println(
                                    notebooks.maker + " " + notebooks.nameModel + ": " + notebooks.RAM + " ГБ");
                        }
                        break;
                    case 2:
                        for (notebooks notebooks : notebooksSet) {
                            System.out.println(
                                    notebooks.maker + " " + notebooks.nameModel + ": " + notebooks.volumeHD + " ГБ");
                        }
                        break;
                    case 3:
                        for (notebooks notebooks : notebooksSet) {
                            System.out.println(notebooks.maker + " " + notebooks.nameModel + ": " + notebooks.os);
                        }
                        break;
                    case 4:
                        for (notebooks notebooks : notebooksSet) {
                            System.out.println(notebooks.maker + " " + notebooks.nameModel + ": " + notebooks.color);
                        }
                        break;
                    
                    default:
                        System.out.println("Ошибка при вводе команды");
                        return;
                }            
        }
    }
}
