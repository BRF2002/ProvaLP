package Questao8;
import java.util.Scanner;

public class Eleitores {

	    public static void main(String[] args) {
	        
	        int idade;
	        int cont16=0,cont16a18e65=0,cont18a65=0;
	        
	        Scanner ler = new Scanner(System.in);
	        for (int i=0;i<=9; i++){
	            System.out.println("Qual a sua idade? ");
	            idade= ler.nextInt();
	                    		

				if (idade<16){
					System.out.println("Você não pode votar!");
					cont16+=1;
				}
				else if (idade>=16 && idade<=18){
					System.out.println("Você pode votar mas não é obrigarório!");
					cont16a18e65+=1;
				}
				else if (idade>65){
						System.out.println("Você pode votar mas não é obrigarório!");
						cont16a18e65+=1;
				}
				else if (idade>=18 && idade<=65){
					System.out.println("Você está habilitado para votar!");
					cont18a65+=1;
				}

			}

	        System.out.println("Quantidade de pessoas menores de 16: "+cont16);
	        System.out.println("Quantidade de pessoas quantidade de pessoas do voto facultativo: "+cont16a18e65);
	        System.out.println("Quantidade de pessoas do voto obrigatório "+cont18a65);
	}
}

