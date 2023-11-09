import java.util.ArrayList;

public class M8Ex6_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tienda tienda = new Tienda("Mi Tienda");

        Producto producto1 = new ProductoElectronico(1, "Telefono", 500, 10, "Samsung");
        Producto producto2 = new ProductoRopa(2, "Camiseta", 20, 50, "M");
        Producto producto3 = new ProductoAlimento(3, "Manzanas", 2, 100, "2023-12-31");

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        Cliente cliente1 = new Cliente("Juan", "12345");
        Cliente cliente2 = new Cliente("Maria", "67890");

        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        ArrayList<Producto> productosCompradosCliente1 = new ArrayList<>();
        productosCompradosCliente1.add(producto1);
        productosCompradosCliente1.add(producto3);
        tienda.realizarVenta(cliente1, productosCompradosCliente1);

        ArrayList<Producto> productosCompradosCliente2 = new ArrayList<>();
        productosCompradosCliente2.add(producto2);
        productosCompradosCliente2.add(producto3);
        tienda.realizarVenta(cliente2, productosCompradosCliente2);

        cliente1.mostrarProductosComprados();
        cliente2.mostrarProductosComprados();

	}
	
	

}
