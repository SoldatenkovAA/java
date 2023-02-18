package homework.HW_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class notebooks {
    int id;
    String maker;
    String nameModel;
    String color;
    int RAM;
    int volumeHD;
    String os;
    int price;
    private Object param;

    public notebooks(int id, String maker, String nameModel, String color, int RAM, int volumeHD, String os,
            int price) {
        this.id = id;
        this.maker = maker; // notebooks здесь - это конструктор класса
        this.nameModel = nameModel; // this - указание, что мы работаем именно с этим объектом
        this.color = color;
        this.RAM = RAM;
        this.volumeHD = volumeHD;
        this.os = os;
        this.price = price;
    }

    public String printnotebooks() {
        return "ID: " + id + ", maker: " + maker + ", model: " + nameModel + ", color: " + color + ", RAM: " + RAM
                + ", volumeHD: " + volumeHD + ", os: " + os + ", price: " + price;
    }
    
    public List<notebooks> findnotebooks(HashSet<notebooks> hashnotebooks, String param) {
        List<notebooks> notebooksList = new ArrayList<notebooks>();
        for (notebooks i : hashnotebooks) {
            if (i.color.equals(color)) {
                notebooksList.add(i);
            }
        }
        return notebooksList;
    }
}
