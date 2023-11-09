
class ProductoRopa extends Producto {
	
    private String talla;
    

    public ProductoRopa(int productoId, String nombre, double precio, int stock, String talla) {
        super(productoId, nombre, precio, stock);
        this.talla = talla;
    }


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}
    
    
}
