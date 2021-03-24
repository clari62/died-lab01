package died.lab01.problema01;

public class Recta {
		Punto p1;
		Punto p2;
		Recta(Punto p1, Punto p2){
			this.p1=p1;
			this.p2=p2;
		}
		public Punto getP1() {
			return p1;
		}
		public void setP1(Punto p1) {
			this.p1 = p1;
		}
		public Punto getP2() {
			return p2;
		}
		public void setP2(Punto p2) {
			this.p2 = p2;
		}
		Recta(){
			this.p1 = new Punto(0,0);
			this.p2 = new Punto(1,1);
		}
		public float pendiente(){
			float retorno;
			retorno = (this.getP2().getY()/this.getP1().getY())/(this.getP2().getX()/this.getP1().getX());
					return retorno;
		}
		public boolean paralelas(Recta otraRecta) {
			float pendiente1 = this.pendiente();
			float pendiente2 = otraRecta.pendiente();
			if(pendiente1==pendiente2) {
				return true;
			}
			else return false;
		}
		public boolean equalsRecta(Object otraRecta) {
			boolean retorno=false;
			if(otraRecta instanceof Recta) {
				Recta nuevaRecta = new Recta(((Recta) otraRecta).getP1(), this.getP1());
				if(nuevaRecta.pendiente()==this.pendiente()  && nuevaRecta.pendiente()==((Recta) otraRecta).pendiente()) {
					retorno=true;;
				}
			}
			return retorno;
		}
}
