package died.lab01.problema02;

public class Temperatura {
	private double grados;
	private Escala escala; 
	
	public Temperatura () {
		this.grados = 0;
		this.escala = Escala.CELCIUS;
	}
	public Temperatura(double temperatura, Escala escala) {
		this.grados=temperatura;
		this.escala=escala;
	}
	public String toString() {
			String retorno;
			if(this.escala==Escala.CELCIUS) {
				retorno=this.grados+"°C";
			}
			else retorno=this.grados+"°F";
			return retorno;
	}
	
	public double asCelcius() {
		double retorno=0.0;
		if(this.escala==Escala.CELCIUS) {
			retorno= this.grados;
		}
		else if(this.escala==Escala.FAHRENHEIT) {
			retorno=(this.grados-32)*5/9;
		}
		return retorno;
	}
	
	public double getGrados() {
		return grados;
	}
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	public void setGrados(double grados) {
		this.grados = grados;
	}
	public double asFahrenheit() {
		double retorno=0.0;
	
		if(this.escala == Escala.FAHRENHEIT) {
			retorno = this.grados;
		}
		else if(this.escala == Escala.CELCIUS) {
			retorno = this.grados*9/5 + 32;
		}
		return retorno;
	}
	
	public void aumentar(Temperatura temperatura) {
		double nuevaTemp=0.0;
		if(temperatura.grados > 0.0 ) {
			if(this.escala==temperatura.escala) {
				nuevaTemp = this.grados + temperatura.grados;
			}
			else if(this.escala==Escala.CELCIUS) {
				nuevaTemp = this.grados + (temperatura.grados-32)*5/9;
			}
			else if(this.escala==Escala.FAHRENHEIT) {
				nuevaTemp = this.grados + (temperatura.grados*9/5)+32;
			}
		}
		
		this.grados = nuevaTemp;
		
	}
	public void disminuir(Temperatura temperatura) {
		double nuevaTemp=0.0;
		if(temperatura.grados > 0.0 ) {
			if(this.escala==temperatura.escala) {
				nuevaTemp = this.grados - temperatura.grados;
			}
			else if(this.escala==Escala.CELCIUS) {
				nuevaTemp = this.grados - (temperatura.grados-32)*5/9;
			}
			else if(this.escala==Escala.FAHRENHEIT) {
				nuevaTemp = this.grados - (temperatura.grados*9/5)+32;
			}
		}
		
		this.grados = nuevaTemp;
		
	}

}
	
