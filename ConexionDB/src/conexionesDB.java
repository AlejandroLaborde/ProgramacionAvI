import java.util.List;

import com.mysql.jdbc.Driver;

public interface conexionesDB {
	
	void abrirConexion();
	void agregarPersona();
	void modificarPersona();
	List<Persona> obtenerTodas();
	Persona obtenerPersona(Integer id);
	void cerrarConexion();
	
}
