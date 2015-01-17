public class Museo extends EspacioPublico {
	
	private int idMuseo;
	private double precio;
	private int anyo;
	
	public Museo (String nombre, String direccion) {
		
		super(nombre, direccion);
	}
	
	public void setIdMuseo (int museo) {
		
		this.idMuseo = museo;
	}
	
	public int getIdMuseo() {
		
		return idMuseo;
	}
	
	public void setPrecio (double precio) {
		
		this.precio = precio;
	}
	
	public double getPrecio() {
		
		return precio;
	}
	
	public void setAnyo (int anyo) {
		
		this.anyo = anyo;
	}
	
	public int getAnyo() {
		
		return anyo;
	}
	
	public void mostrarDatos () {
		
		System.out.println("\n--- Museo ---");
		System.out.println("Id: " + idMuseo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Anyo construcción: " + anyo);
		System.out.println("Dirección: " + direccion);
		System.out.println("Precio: " + precio + "€");
	}
}