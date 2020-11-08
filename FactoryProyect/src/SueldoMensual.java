
public class SueldoMensual implements ICalculoSueldo  {

	@Override
	public double calcular(Empleado empleado) {
		System.out.println("Sueldo mensual");
		return empleado.getSueldo();
	}

}
