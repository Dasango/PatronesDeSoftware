package Builder2.imple;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Libro {
    private Integer id;
    private String titulo;
    private String isbn;
    private Integer idAutor;
    private Integer numPag;

}
