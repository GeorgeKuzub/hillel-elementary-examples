package datastructure.hashtable;

public class Main {
    public static void main(String[] args) {
        MyHashTable hashTable = new MyHashTable();

        Book book1 = new Book("A1", "PUSHKIN");
        hashTable.push("A", book1);

        Book book2 = new Book("A2", "Figushkin");
        hashTable.push("AB", book2);

        Book book3 = new Book("A3", "Hrushkin");
        hashTable.push("ABC", book3);

        Book book4 = new Book("A4", "Titushkin");
        hashTable.push("ABCD", book4);


        System.out.println(hashTable.get("ASDASDAD"));

        System.out.println(hashTable.get("ABCD"));

        hashTable.delete("ABCD");

        System.out.println(hashTable.get("ABCD"));


        int debug$ = 1;
    }
}
