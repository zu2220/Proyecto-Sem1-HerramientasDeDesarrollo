
package controlador;

/**
 *
 * @author oscar
 */
import static conexionDB.ConexionDB.DataSource;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.ProductoReferencia;
public class Controlador_ProductoReferencia {
    public ArrayList<ProductoReferencia> getProductos(){
        ArrayList<ProductoReferencia> productos = new ArrayList<>();
    
        try{
            String query = "select* from ProductoReferencia";
            PreparedStatement pstmt = DataSource().prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                ProductoReferencia producto = new ProductoReferencia();
                producto.setCodigo(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                
                productos.add(producto);
            }
        
        }catch(Exception ex){System.out.println(ex);}
        
        return productos;
    }
    
}
