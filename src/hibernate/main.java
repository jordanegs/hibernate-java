package hibernate;

import com.hibernate.model.ModelMarca;
import com.hibernate.model.ModelPresentacion;
import com.hibernate.model.ModelProducto;
import com.hibernate.model.ModelProveedor;
import com.hibernate.model.ModelZona;
import com.hibernate.model.persistencia.Marca;
import com.hibernate.model.persistencia.Presentacion;
import com.hibernate.model.persistencia.Producto;
import com.hibernate.model.persistencia.Proveedor;
import com.hibernate.model.persistencia.Zona;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        Marca marca = ModelMarca.verMarca(1);
//        Presentacion presentacion = ModelPresentacion.verPresentacion(1);
//        Proveedor proveedor = ModelProveedor.verProveedor(1);
//        Zona zona = ModelZona.verZona(1);
//        
//        Producto producto = new Producto();
//        producto.setMarca(marca);
//        producto.setPresentacion(presentacion);
//        producto.setProveedor(proveedor);
//        producto.setZona(zona);
//        producto.setCodigo(2);
//        producto.setDescripcion_producto("Producto 2");
//        producto.setPrecio(120);
//        producto.setStock(10);
//        producto.setIva(123);
//        producto.setPeso(300);
//        ModelProducto.crearProducto(producto);
        
        //Marca marca = ModelMarca.verMarca(3);
        //System.out.println(marca.getDescripcion());
        
        //Marca marca = new Marca();
        //marca.setDescripcion("Marca 3");
        //ModelMarca.crearMarca(marca);
        
        Marca marca = ModelMarca.verMarca("Marca 1");
        System.out.println(marca.getDescripcion());
        
//        List<Producto> productos = ModelProducto.verProductos();
//        productos.forEach((producto) -> {
//            System.out.println(producto.getDescripcion_producto());
//            System.out.println(producto.getMarca().getDescripcion());
//        });
    }
}
