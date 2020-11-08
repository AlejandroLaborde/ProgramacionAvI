package ejercicio13;

public class Persona implements Comparable<Persona> {
	public String apellido;
	public String Nombre;
	public Integer dni;
	
	
	public Persona() {
		super();
		
	}
	
	public Persona(String apellido, String nombre, Integer dni) {
		super();
		this.apellido = apellido;
		this.Nombre = nombre;
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Nombre + " " + this.apellido + " DNI:  " + this.dni;
	}
	
	@Override
	public boolean equals( Object o  ) {
		
		if( o.getClass().equals(this.getClass()) )
		{
			Persona aux = (Persona)o;
			
			if( aux.apellido.equals(this.apellido) && aux.getNombre().equals(this.Nombre) && aux.getDni().equals(this.dni)  ) {
				return true;
			}else {
				System.out.println("2");
				return false;
			}
			
		}else {
			System.out.println("1");
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		
		int primo = 31;
		//Se multiplica por todos los atributos que uso en el equals
		//cuando 2 objetos dan true en el equals, el hashCode, debe ser el mismo
		return primo * this.Nombre.hashCode() * this.apellido.hashCode() * this.dni.hashCode();
	}

	@Override
	public int compareTo(Persona o) {
	
		return o.apellido.compareTo(this.apellido);
	}
	
	
	
}
