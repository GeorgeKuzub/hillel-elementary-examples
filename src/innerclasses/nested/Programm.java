package innerclasses.nested;

 class Programm {
    public static void main(String[] args) {
        ArrayAlg.Pair pair = new
                ArrayAlg.Pair(1.1, 2.2);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
