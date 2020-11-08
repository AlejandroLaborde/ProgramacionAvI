
public class SueldoPorHora  implements ICalculoSueldo {

	@Override
	public double calcular(Empleado empleado) {
		System.out.println("Sueldo por hora");
		return empleado.getSueldo()/empleado.getCantidadHorasTrabajadas();
	}

}
