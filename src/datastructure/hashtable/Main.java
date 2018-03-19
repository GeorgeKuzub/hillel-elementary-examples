package datastructure.hashtable;

public class Main {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable();
        Book book1 = new Book("ABC", "Pushkin");
        Book book2 = new Book("ABCDE", "Tolstoy");
        Book book3 = new Book("ABCDEF", "Dostoevskiy");
        Book book4 = new Book("ABCDEF", "Bulgakov");

        myHashTable.push("S1", book1);
        myHashTable.push("S1", book4);
        myHashTable.push("S22", book2);
        myHashTable.push("S333", book3);

        Book myFavorBook = myHashTable.get("S333");
        myHashTable.delete("S22");

        System.out.printf("My Favor Book is:\n \t %s", myFavorBook);
        int $ = 1;
    }
}
