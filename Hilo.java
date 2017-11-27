public class Hilo extends Thread {
	
	/*simulacion de trabajador para red de petri*/
	
	private final String nombre;
	public Hilo(String nombreHilo) {
		super(nombreHilo);
		this.nombre = nombreHilo;
	}
	public void run() { /*genera un conteo de 100 numeros*/
 		for(int i=0;i<100;i++){
			 System.out.println(this.nombre + ":\t%" + i);
			 try {
				sleep(50);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
