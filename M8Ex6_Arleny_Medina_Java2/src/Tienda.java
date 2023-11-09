import java.util.ArrayList;

public class Tienda {
	
	private String nombre;
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
  
    public Tienda(String nombre, ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
		
		this.nombre = nombre;
		this.productos = productos;
		this.clientes = clientes;
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Producto> getProductos() {
		return this.productos;
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public static <T> int buscarPosicion(ArrayList<T> lista, T elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    
    
    
    public void realizarVenta(Cliente cliente, ArrayList<Producto> productosComprados) {
        int posicionCliente = buscarPosicion(clientes, cliente);

        if (posicionCliente != -1) {
            for (Producto producto : productosComprados) {
                int posicionProducto = buscarPosicion(productos, producto);

                if (posicionProducto != -1) {
                    clientes.get(posicionCliente).comprarProducto(producto);
                    productos.get(posicionProducto).disminuirStock();
                } else {
                    System.out.println(producto.getNombre() + " no esta disponible en la tienda.");
                }
            }
        } else {
            System.out.println(cliente.getNombre() + " no es un cliente registrado en la tienda.");
        }
    }

}


    
        

    
