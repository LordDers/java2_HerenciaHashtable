import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		
		String nombre = null, direccion = null;
		
		Parque parque = new Parque (nombre, direccion);
		parque.setNombre("Cristina Enea");
		parque.setDireccion("calle1");
		parque.setNumBancos(6);
		
		parque.mostrarDatos();
		
		//String nombreMuseo = null, direccionMuseo = null;
		
		Museo museo = new Museo (nombre, direccion);
		museo.setNombre("San Telmo");
		museo.setDireccion("calle2");
		museo.setIdMuseo(001);
		museo.setAnyo(1993);
		museo.setPrecio(6.66);
		
		museo.mostrarDatos();
		
		Hashtable <String, Double> museos = new Hashtable <String, Double> ();
		museos.put("San Telmo", 6.66);
		museos.put("Naval", 7.15);
		
		System.out.println("\n--- Precio Museos ---");
		System.out.println("San Telmo: " + museos.get("San Telmo"));
		System.out.println("Naval: " + museos.get("Naval"));
	}
}