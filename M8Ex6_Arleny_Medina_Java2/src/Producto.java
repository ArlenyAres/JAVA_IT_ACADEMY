
public class Producto {
	
	private int productoId;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int productoId, String nombre, double precio, int stock) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    


	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public int setProdurctoId () {
		return this.productoId;
	}
    
    
    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }
    
    
    public void disminuirStock() {
        stock--;
    }
}


