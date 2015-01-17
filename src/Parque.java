public class Parque extends EspacioPublico {
	
	private int numBancos;
	
	public Parque (String nombre, String direccion) {
		
		super(nombre, direccion);
	}
	
	public void setNumBancos (int bancos) {
		
		this.numBancos = bancos;
	}
	
	public int getNumBancos () {
		
		return numBancos;
	}
	
	public void mostrarDatos () {
		
		System.out.println("\n--- Parque ---");
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Número Bancos: " + numBancos);
	}
}