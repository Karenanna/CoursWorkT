package book1;

public class Main {
    public static void main(String[] args) {
        String[] book = new String[1];
        book[0] = "Джордж Оруэлл '1984'";
        book[1] = "Лев Толстой 'Война и мир'";
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }
}