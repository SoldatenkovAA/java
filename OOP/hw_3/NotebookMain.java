package OOP.hw_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NotebookMain {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(1500, 4));
        notebooks.add(new Notebook(1400, 8));
        notebooks.add(new Notebook(2200, 16));
        notebooks.add(new Notebook(2450, 8));
        notebooks.add(new Notebook(2100, 16));

        System.out.println("Сортировка по цене: ");
        Comparator<Notebook> PriceComparator = new PriceValueComparator();
        Collections.sort(notebooks, PriceComparator);
        for (Notebook notebook: notebooks) {
        notebook.printNotebook();
        }

        System.out.println("Сортировка по RAM: ");
        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam));
        for (Notebook notebook: notebooks) {
        notebook.printNotebook();
        }

        System.out.println("Сортировка по RAM, потом по цене: ");
        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam)
        .thenComparingDouble(Notebook::getPrice));
        for (Notebook notebook : notebooks) {
        notebook.printNotebook();
        }

    }

    public static class Notebook {
        private double price;
        private int ram;

        public Notebook(double price, int ram) {
            this.price = price;
            this.ram = ram;
        }

        public double getPrice() {
            return price;
        }

        public int getRam() {
            return ram;
        }

        public String printNotebook() {
            System.out.println("цена: " + price + "; RAM: " + ram + ";");
            return null;
        }
    }

    public static class PriceValueComparator implements Comparator<Notebook> {

        @Override
        public int compare(Notebook o1, Notebook o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }
}
