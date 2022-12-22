package lab2.task7;

public class BookShelf
{
    private Book[] arr_bookshelf = new Book[20];
    private int countbook = 0;

    public void addBook(String name, String author, int year)
    {
        this.arr_bookshelf[this.countbook] = new Book(name, author, year);
        this.countbook++;
    }
    public void printBookShelf()
    {
        System.out.println("Книжная полка: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(arr_bookshelf[i]);
        }
    }

    public void bookSort(){
        int arr1[] = new int[countbook];
        int arr2[] = new int[countbook];
        for (int i = 0; i < countbook; i++) {
            arr1[i] = arr_bookshelf[i].getYear();
            arr2[i] = i;
        }
        int temp;
        for(int i = 0; i < countbook; i++){
            for(int j = 1; j < (countbook - i); j++){
                if(arr1[j - 1] > arr1[j]){
                    temp = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp;

                    temp = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        Book arrBook[] = new Book[countbook];
        for (int i = 0; i < countbook; i++) {
            arrBook[i] = arr_bookshelf[arr2[i]];
        }
        arr_bookshelf = arrBook;
    }

    public Book earliestBook(){
        int min = arr_bookshelf[0].getYear(), k = 0;
        for (int i = 1; i <= countbook - 1; i++) {
            if (arr_bookshelf[i].getYear() < min){
                min = arr_bookshelf[i].getYear();
                k = i;
            }
        }
        return arr_bookshelf[k];
    }

    public Book latestBook(){
        int max = arr_bookshelf[0].getYear(), k = 0;
        for (int i = 1; i <= countbook - 1; i++) {
            if (arr_bookshelf[i].getYear() > max){
                max = arr_bookshelf[i].getYear();
                k = i;
            }
        }
        return arr_bookshelf[k];
    }
}
