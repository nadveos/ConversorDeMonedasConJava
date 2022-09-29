import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SALIR:
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Conversor de Monedas");
			System.out.println("1 - ARS to USD\n"
					+ "2 - USD to ARS\n"
					+ "3 - Finalizar");
			System.out.print("Elija una opción: ");
			Scanner leerOpcion = new Scanner(System.in);
			char opcion = leerOpcion.next().charAt(0);
			switch (opcion){
			case '1':convertir(153.00, "Pesos Argentinos");
				
				break;
			case '2':invertir(1, "Dolar Estadounidense");
			
			case '3':
				System.out.println("------------------------");
				System.out.println("Finalizando Programa");
				System.out.println("------------------------");
				break SALIR;
			default:System.out.println("Opción Incorrecta");
				break;
			}
			
		}

	}
	static void convertir (double valorDolar, String pais) {
		Scanner ingresarValor = new Scanner (System.in);
		System.out.printf("Ingrese cantidad de %s a convertir: ",  pais);
		double cantidad = ingresarValor.nextDouble();
		double dolar = cantidad / valorDolar;
		dolar = (double) Math.round(dolar*100d)/100;
		System.out.println("------------------------");
		System.out.println("	Son u$s"+ dolar +" Dolares Estadounidenses");
		System.out.println("------------------------");
		
		
	}
	static void invertir (double monedaLocal, String pais) {
		Scanner ingresarValor = new Scanner (System.in);
		System.out.printf("Ingrese cantidad de %s a convertir: ",  pais);
		monedaLocal = 153.00;
		double cantidad = ingresarValor.nextDouble();
		double moneda = cantidad * monedaLocal;
		moneda = (double) Math.round(moneda*100d)/100;
		System.out.println("------------------------");
		System.out.println("	Son $"+ moneda +" Pesos Argentinos");
		System.out.println("------------------------");
	}
}
