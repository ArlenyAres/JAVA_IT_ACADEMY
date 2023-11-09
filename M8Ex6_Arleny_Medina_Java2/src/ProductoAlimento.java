
class ProductoAlimento extends Producto {
	
	
    private String fechaVencimiento;

    public ProductoAlimento(int productoId, String nombre, double precio, int stock, String fechaVencimiento) {
        super(productoId, nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

	public String getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
    
    
    
}