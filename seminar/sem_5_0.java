package seminar;

import java.util.HashMap;

public class sem_5_0 {
    public static void main(String[] args) {
        HashMap<Integer, String> userData = new HashMap<Integer, String>();
        userData.put(123456, "Иванов");
        userData.put(321456, "Васильев");
        userData.put(234561, "Петрова");
        userData.put(234432, "Иванов");
        userData.put(654321, "Петрова");
        userData.put(345678, "Иванов");
        for (Integer user : userData.keySet()) {
            if (userData.get(user) == "Иванов") {
                System.out.printf("Паспорт Иванова: %s\n", user);
            }
        }
    }

}
