package SupuestosPracticos.Facturas;

public class Factura extends Precio {
	private String emisor;
	private String cliente;
	
	public Factura(double cantidad, String emisor, String cliente) {
		super(cantidad);
		this.emisor = emisor;
		this.cliente = cliente;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void imprimirFactura() {
		System.out.println("Factura:");
		System.out.println("Emisor: " + emisor);
		System.out.println("Cliente: " + cliente);
		System.out.println("Cantidad: " + getCantidad());
	}
	
	
	
	
	
}
