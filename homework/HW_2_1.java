/*
Задание 1.
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Входная строка:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Выходная строка:
select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
*/

package homework;

public class HW_2_1 {
    public static final String sqlText = "select * from students where ";
    public static final String dirtyText = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

    public static void main(String[] args) {
        String cleanText = dirtyText.replace('{', ' ').replace('}', ' ');
        String[] newStr = cleanText.split(",");
        StringBuilder finalStr = new StringBuilder(sqlText);
        for (int i = 0; i < newStr.length; i++) {
            String[] items = newStr[i].replace('"', ' ').split(":");
            if (!"null".equals(items[1].trim())) {
                finalStr.append(items[0].trim()).append(" = ").append("'").append(items[1].trim()).append("'");
                if (i < newStr.length - 2)
                    finalStr.append(" and ");
            }
        }
        System.out.println(finalStr);
    }
}
