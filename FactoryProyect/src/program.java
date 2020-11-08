
public class program {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Emp1","ape1","321","soltero",91000.0,50,ETipoCobro.porHora);
		Empleado e2 = new Empleado("Emp2","ape2","321","soltero",91000.0,50,ETipoCobro.porHora);
		Empleado e3 = new Empleado("Emp3","ape3","321","soltero",91000.0,50,ETipoCobro.mensual);
		Empleado e4 = new Empleado("Emp4","ape4","321","soltero",91000.0,50,ETipoCobro.mensual);
		Empleado e5 = new Empleado("Emp5","ape5","321","soltero",91000.0,50,ETipoCobro.porHora);
		
		
		LiquidaSueldos.liquida(e1.getTipoCobro()).calcular(e1);
		LiquidaSueldos.liquida(e2.getTipoCobro()).calcular(e2);
		LiquidaSueldos.liquida(e3.getTipoCobro()).calcular(e3);
		LiquidaSueldos.liquida(e4.getTipoCobro()).calcular(e4);
		LiquidaSueldos.liquida(e5.getTipoCobro()).calcular(e5);
		
	}

}
