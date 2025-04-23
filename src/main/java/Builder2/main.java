package Builder2;

import Builder2.imple.Libro;

public class main {
    public static void main(String[] args) {
        Libro lib= Libro
                .builder()
                .id(1)
                .titulo("AAA")
                .isbn("CR123")
                .build();
        System.out.println(lib);
    }
}
