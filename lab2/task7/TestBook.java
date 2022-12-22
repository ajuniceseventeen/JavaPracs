package lab2.task7;

public class TestBook {

    public static void main(String[] args) {
        BookShelf ob_bookshelf = new BookShelf();

        ob_bookshelf.addBook("«Мастер и Маргарита»","М.А.Булгаков",1966);
        ob_bookshelf.addBook("«Мартин Иден»","Джек Лондон",1909);
        ob_bookshelf.addBook("«Тарас Бульба»","Н.В.Гоголь",1835);
        ob_bookshelf.addBook("«Робинзон Крузо»","Даниель Дефо",1719);
        ob_bookshelf.addBook("«Капитанская дочка»","А.С.Пушкин",1836);

        ob_bookshelf.printBookShelf();

        ob_bookshelf.bookSort();

        System.out.println("Отсортированная полка по году издания.");
        ob_bookshelf.printBookShelf();

        System.out.println("Книга с самым поздним годом издания.");

        System.out.println(ob_bookshelf.latestBook());

        System.out.println("Книга с самым ранним годом издания.");
        System.out.println(ob_bookshelf.earliestBook());
    }
}