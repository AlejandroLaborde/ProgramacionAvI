
public class Empleado {
	
	public String nombre;
	public String apellido;
	public String cuil;
	public String estado;
	public Double sueldo;
	public Integer cantidadHorasTrabajadas;
	public ETipoCobro tipoCobro;
	
	
	
	
	
	public Empleado(String nombre, String apellido, String cuil, String estado, Double sueldo,
			Integer cantidadHorasTrabajadas, ETipoCobro tipoCobro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.estado = estado;
		this.sueldo = sueldo;
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.tipoCobro = tipoCobro;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public Integer getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}
	public void setCantidadHorasTrabajadas(Integer cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}
	public ETipoCobro getTipoCobro() {
		return tipoCobro;
	}
	public void setTipoCobro(ETipoCobro tipoCobro) {
		this.tipoCobro = tipoCobro;
	}
	
	
	
	
	
	
	
}
