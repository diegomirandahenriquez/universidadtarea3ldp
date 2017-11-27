public class ReddePetri{
	
	/*MODELAMIENTO DE UNA RED DE PETRI DE EL CICLO DE DESARROLLO DE SOFTWARE*/
	
	public static void main(String[] args) throws InterruptedException {
		while(true){
			Hilo analista = new Hilo("Analista");  			/*crea el hilo de analista*/
			Hilo diseñador = new Hilo("Diseñador");			/*crea el hilo de diseñador*/
			
			analista.start();					/*corre al analista*/
			diseñador.start();					/*corre al diseñador*/
			analista.join();					/*espera al analista*/
			diseñador.join();					/*espera al diseñador*/
			
			Hilo programador1 = new Hilo("Programador1");		/*crea el hilo de programador 1*/
			Hilo programador2 = new Hilo("Programador2");		/*crea el hilo de programador 2*/
			
			programador1.start();					/*corre al programador 1*/
			programador2.start();					/*corre al programador 2*/
			programador1.join();					/*espera al programador 1*/
			programador2.join();					/*espera al programador 2*/
			
			Hilo testing = new Hilo("Testing");			/*crea el hilo de testing*/
			
			testing.start();					/*corre al testing*/
			testing.join();						/*espera al testing*/
		}
	}
}
