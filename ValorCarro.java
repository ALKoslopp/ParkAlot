# ParkAlot
public class ValorCarro {
	
	public static double precoPorHora(double hora){
		if(hora >= 2.00){
			hora = hora * 2.5;
		} 
		if(hora >= 1.00 || hora < 2.00){
			hora = hora * 2.00;
		} 
		if(hora < 1.00){
			hora = (hora / 0.60)/2.00*2;
		}
		return hora;
	}
