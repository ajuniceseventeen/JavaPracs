package lab6.task9;

import lab6.task6.Printable;
import lab6.task7.Book;
import lab6.task8.Shop;

import java.util.ArrayList;
import java.util.List;

public class TestPrintable {
    public static void main(String[] args) {
        List<Printable> list= new ArrayList<>();
        list.add(new Book("kniga", "da"));
        list.add(new Book("knigaaaa", "dada"));
        list.add(new Shop("zhurnal", 23500));
        list.add(new Shop("zhurnalll", 15020));

        for (var p : list) {
            p.print();
        }
    }
}
