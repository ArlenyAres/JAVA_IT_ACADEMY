import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
    private String dni;
    private ArrayList<Producto> productosComprados = new ArrayList<>();

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    

    public String getDni() {
		return this.dni;
	}
    
    public String getNombre() {
        return this.nombre;
    }



	public ArrayList<Producto> getProductosComprados() {
		return productosComprados;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public void setProductosComprados(ArrayList<Producto> productosComprados) {
		this.productosComprados = productosComprados;
	}



	public void comprarProducto(Producto producto) {
        productosComprados.add(producto);
    }

    public void mostrarProductosComprados() {
        System.out.println("Productos comprados por " + nombre + ":");
        for (Producto producto : productosComprados) {
            System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio() + " - Stock: " + producto.getStock());
        }
    }

    

}
