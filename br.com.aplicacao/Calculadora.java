package aplicacao;

public class Calculadora {
	public static void main(String[] args){
		
		double num1, num2, resultado;
		int opcao;
		boolean parar = true;
		
		do{
			
			System.out.println("Digite um Número: ");
			num1 = Console.readDouble();
			System.out.println("Digite outro número: ");
			num2 = Console.readDouble();
			System.out.println("Escolha uma opção da calculadora:\n ");
			System.out.println("1- Soma\n");
			System.out.println("2- Subtração\n");
			System.out.println("3- Multiplicação\n");
			System.out.println("4- Divisão\n");
			System.out.println("5- Sair\n");
			opcao = Console.readInt();
			
			switch(opcao) {
				case 1 : 
					System.out.println("\nVocê selecionou soma.");
					resultado = num1 + num2;
					System.out.println("\nO resultado foi: "  +  resultado + ". ");
					break;
				
				case 2:
					
					System.out.println("\nVocê selecionou Subtração.");
					resultado = num1 - num2;
					System.out.println("\nO resultado foi: " + resultado + ". ");
					break;
					
				case 3:
					
					System.out.println("\nVocê selecionou Multiplicação.");
					resultado = num1 * num2;
					System.out.println("\nO resultado foi: " + resultado + ". ");
					break;
					
				case 4:
					
					System.out.println("\nVocê selecionou Divisão.");
					resultado = num1 / num2;
					System.out.println("\nO resultado foi: " + resultado + ". ");
					break;
					
				case 5:
					
					System.out.println("\nObrigado por usar nosso sistema.\n");
					if(parar == true);
					break;
					
				default:
					System.out.println("\nOpção invalida\n");
				
			}
			
			System.out.println("\nDeseja continuar? Digite 1-SIM ou 2-NãO: ");
			opcao = Console.readInt();
				if (opcao == 2) {
					parar = false;
				}
			
			
		}while(parar);
		System.out.println("\nObrigado por usar nosso sistema.\n");
	}
}
				