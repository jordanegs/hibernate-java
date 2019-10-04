package hibernate;

import com.hibernate.model.ModelMarca;
import com.hibernate.model.ModelPresentacion;
import com.hibernate.model.ModelProducto;
import com.hibernate.model.ModelProveedor;
import com.hibernate.model.ModelZona;
import com.hibernate.model.persistencia.Marca;
import com.hibernate.model.persistencia.Producto;

public class main {
    public static void main(String[] args) {
        //ModelProducto.verProducto();
        //Producto producto = new Producto();
        //producto.setMarca();
        //producto.setCodigo(2);
        //producto.setDescripcion_producto("Producto 2");
        //producto.setPrecio(120);
        //producto.setStock(10);
        //producto.setIva(123);
        //producto.setPeso(300);
        //ModelProducto.crearProducto(producto);
        
        //Marca marca = ModelMarca.verMarca(3);
        //System.out.println(marca.getDescripcion());
        
        //Marca marca = new Marca();
        //marca.setDescripcion("Marca 3");
        //ModelMarca.crearMarca(marca);
        
        //ModelMarca.actualizarMarca(2, "Marca 222222");
        //ModelMarca.eliminarMarca(2);
        
        System.out.println(ModelMarca.verMarca(1).getDescripcion());
        System.out.println(ModelPresentacion.verPresentacion(1).getDescripcion());
        System.out.println(ModelProveedor.verProveedor(1).getDescripcion());
        System.out.println(ModelZona.verZona(1).getDescripcion());
        System.out.println(ModelProducto.verProducto(1).getDescripcion_producto());
    }
}
