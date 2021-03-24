package died.lab01.problema03;

import died.lab01.problema02.Temperatura;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private int indiceActual;
	
		public Registro() {
			this.ciudad="-";
			this.historico = new Temperatura[30];
			this.indiceActual=0;
		}
		public Registro(String ciudad) {
			this.ciudad=ciudad;
			this.historico = new Temperatura[30];
			this.indiceActual=0;
		}
		public String getCiudad() {
			return this.ciudad;
		}
		public void imprimir() {
			System.out.println("TEMPERATURAS REGISTRADAS EN: "+this.ciudad);
				for(int i=0;i<indiceActual;i++) {
					System.out.println(this.historico[i]);
			}
		}
		public void agregar(Temperatura t) {
			if(indiceActual<29) {
				this.historico[indiceActual]=t;
				this.indiceActual++;
			}
		}
		
		public double MediaAsCelcius() {
			double promedio=0.0;
			for(int i=0;i<this.indiceActual;i++) {
				promedio += this.historico[i].asCelcius();
			}
			promedio=promedio/(this.indiceActual);
			return promedio;
		}
		public double MediaAsFahrenheit() {
			double promedio=0.0;
			for(int i=0;i<this.indiceActual;i++) {
				promedio += this.historico[i].asFahrenheit();
			}
			promedio=promedio/(indiceActual+1);
			return promedio;
		}
		
		
		public Temperatura maximo() {
			Temperatura retorno = new Temperatura();
			retorno = maximoAux(this.historico,0,historico[0]);
				return retorno;
		}
		
		private Temperatura maximoAux(Temperatura[] historico, int indice, Temperatura max) {
				if(indice != this.indiceActual-1) {
					if(historico[indice].asCelcius() > max.asCelcius()) {
						max = maximoAux(historico, indice+1, historico[indice]);
					}
					else {
						max = maximoAux(historico, indice+1, max);	
					}
					
				}
			return max;
		}
	
}



	

