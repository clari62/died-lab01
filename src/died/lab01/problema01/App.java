package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto P1= new Punto(1,1);
		Punto P2= new Punto(2,2);
		
		Recta R1= new Recta(P1,P2);
		System.out.println("La pendiente de la recta R1 es: "+ R1.pendiente());
		
		Punto P3= new Punto(3,3);
		Recta R2= new Recta(P2,P3);
		if(R1.equalsRecta((Object)R2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
