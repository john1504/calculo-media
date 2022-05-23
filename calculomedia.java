package calculomedia;

import java.util.Scanner;

public class calculomedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);//criando scanner para ler as variaveis//
		 
        float ac1,ac2,ag,af;  //criando as variaveis//
       
        
        System.out.printf("Digite a sua nota da ac1: ");//pessoa vai digitar sua nota//
      
        ac1 = ler.nextFloat();//Scanner vai ler e guardar a nota que a pessoa digitou//
       
        System.out.printf("Digite a sua nota da ac2: ");
      
        ac2 = ler.nextFloat();
      
        System.out.printf("Digite a sua nota da ag: ");
   
        ag = ler.nextFloat();
        
        System.out.printf("Digite sua nota da af: ");
       
        af = ler.nextFloat();
       
        
         double media = ((ac1 * 0.15)  + (ac2 *  0.3) + (ag * 0.1 ) + (af * 0.45));//coloquei o double para calcular a conta conforme o enunciado pedia//
        
    System.out.printf("A sua media e: %f\n " ,media );//aqui vai imprimir a nota da pessoa conforme calculado//

    if (media >= 5)//if criado para que a nota seja maior ou igual que 5, sera aprovado se não caira no else//

    {
    System.out.println("Voce foi aprovado.");
 
    }
    else
    System.out.println("Voce foi reprovado."); 

        

    }

	}
