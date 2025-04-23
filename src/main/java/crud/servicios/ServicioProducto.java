package crud.servicios;


import crud.db.DbConfig;
import crud.modelo.Producto;

import java.util.List;

public interface ServicioProducto {
    void setDbConfig(DbConfig dbConfig);
    void create(Producto p);
    Producto read(int id);
    List<Producto> listar ();
    void update(Producto p);
    void delete(int id);
}
