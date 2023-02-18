package seminar.sem_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class cat {
    String name;
    int age;
    String color;
    String breed;
    String gender;
    Boolean purring;
    int id;

    
    public cat ( String name, int age, String color, String breed, String gender, Boolean purring, int id){
        this.name = name; //cat здесь - это конструктор класса
        this.age = age; //this - указание, что мы работаем именно с этим объектом
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.purring = purring;
        this.id = id;
    }
    
    public String printCat() {
        return "Name: " + name + ", breed: " + breed + ", color: " + color + ", age: " + age ;
    }

    public List <cat> findCat(HashSet <cat> hashCat, String gender) {
        List <cat> catList = new ArrayList<cat>();
        for (cat i : hashCat) {
            if(i.gender.equals(gender)) {
                catList.add(i);
            }
        }
        return catList;
    }
}
