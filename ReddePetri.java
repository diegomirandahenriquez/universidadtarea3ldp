public class ReddePetri{
	
	public static void main(String[] args) throws InterruptedException {
		while(true){
			Hilo analista = new Hilo("Analista");
			Hilo diseñador = new Hilo("Diseñador");
			
			analista.start();
			diseñador.start();
			analista.join();
			diseñador.join();
			
			Hilo programador1 = new Hilo("Programador1");
			Hilo programador2 = new Hilo("Programador2");
			
			programador1.start();
			programador2.start();
			programador1.join();
			programador2.join();
			
			Hilo testing = new Hilo("Testing");
			
			testing.start();
			testing.join();
		}
	}
}
