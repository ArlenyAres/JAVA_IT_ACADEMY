
class ProductoElectronico extends Producto {
	
	
    private String marca;

    public ProductoElectronico(int productoId, String nombre, double precio, int stock, String marca) {
        super(productoId, nombre, precio, stock);
        this.marca = marca;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
    
    
    
    
    
}