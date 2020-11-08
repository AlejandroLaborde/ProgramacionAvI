
public class LiquidaSueldos  {

	public static ICalculoSueldo liquida(ETipoCobro cobro) {
		
		if(cobro.equals(ETipoCobro.mensual)) {
			return new SueldoMensual();
		}else {
			return new SueldoPorHora();
		}
		
	}
	
}
