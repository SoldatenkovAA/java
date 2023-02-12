/*
Задание 1.
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
package homework.HW_5;

import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class HW_5_1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<String, List<String>>();

    public static void main(String[] args) {
        addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя контакта: ");
        String str = sc.nextLine();
        sc.close();
        findPerson(str);
    }

    public static void addPerson() {
        phoneBook.put("John", List.of("111111", "222222"));
        phoneBook.put("Peter", List.of("333333", "444444"));
        phoneBook.put("Andy", List.of("555555", "666666"));
        phoneBook.put("George", List.of("777777", "888888"));
        phoneBook.put("Mike", List.of("999999", "000000"));
    }

    public static void findPerson(String name) {
        System.out.printf("%s: %s\n", name, phoneBook.get(name));
    }
}
