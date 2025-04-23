package crud.servicios;



import crud.db.DbConfig;
import crud.modelo.Producto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicioProdImpl implements ServicioProducto {

    DbConfig dbConfig;

    @Override
    public void setDbConfig(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    @Override
    public void create(Producto p) {
        try (var con = dbConfig.getConnection()) {
            var pstmt = con.prepareStatement("INSERT INTO productos (id, nombre, precio, cantidad) VALUES (?, ?, ?, ?)");
            pstmt.setInt(1, p.getId());
            pstmt.setString(2, p.getNombre());
            pstmt.setDouble(3, p.getPrecio());
            pstmt.setInt(4, p.getCantidad());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
        }
    }

    @Override
    public Producto read(int id) {
        Producto producto = null;
        try (var con = dbConfig.getConnection()) {
            var pstmt = con.prepareStatement("SELECT * FROM productos WHERE id = ?");
            pstmt.setInt(1, id);

            var rs = pstmt.executeQuery();
            if (rs.next()) {
                producto = new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al leer producto: " + e.getMessage());
        }
        return producto;
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        try (var con = dbConfig.getConnection()) {
            var pstmt = con.prepareStatement("SELECT * FROM productos");
            var rs = pstmt.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar productos: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public void update(Producto p) {
        try (var con = dbConfig.getConnection()) {
            var pstmt = con.prepareStatement("UPDATE productos SET nombre = ?, precio = ?, cantidad = ? WHERE id = ?");
            pstmt.setString(1, p.getNombre());
            pstmt.setDouble(2, p.getPrecio());
            pstmt.setInt(3, p.getCantidad());
            pstmt.setInt(4, p.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        try (var con = dbConfig.getConnection()) {
            var pstmt = con.prepareStatement("DELETE FROM productos WHERE id = ?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e.getMessage());
        }
    }
}
