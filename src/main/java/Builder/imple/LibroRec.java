package Builder.imple;


public record LibroRec(Integer id, String title, String  isbn, Integer idAutor, Integer numPag ) {
    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private Integer id;
        private String titulo;
        private String isbn;
        private Integer idAutor;
        private Integer numPag;

        public Builder() {

        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder titulo(String title) {
            this.titulo = titulo;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder idAutor(Integer idAutor) {
            this.idAutor = idAutor;
            return this;
        }

        public Builder numPag(Integer numPag) {
            this.numPag = numPag;
            return this;
        }

        public LibroRec build(){
            return new LibroRec(id, titulo, isbn, idAutor, numPag);
        }
    }

    public static void main(String[] args) {
        LibroRec libro= LibroRec
                .builder()
                .id(1)
                .titulo("Java")
                .isbn("322")
                .idAutor(2)
                .numPag(2)
                .build();
        LibroRec libro2= LibroRec
                .builder()
                .id(1)
                .titulo("Java")
                .isbn("322")
                .idAutor(2)
                .numPag(2)
                .build();

        System.out.println(libro);


    }
}
