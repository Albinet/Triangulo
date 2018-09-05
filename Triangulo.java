import java.util.Scanner;

public class Triangulo
{
    
    public static void main (String[] args)
    {
        
        Scanner input = new Scanner(System.in);

        int lado1; 
        int lado2;
        int lado3;  
        
        System.out.print("Insira o primeiro lado: "); 
        lado1 = input.nextInt(); 

        System.out.print("Insira o segundo lado: ");
        lado2 = input.nextInt(); 

        System.out.print("Insira o terceiro lado: ");
        lado3 = input.nextInt(); 

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            if(lado1 != lado2 && lado1 != lado3){
                System.out.print("O tri\u00e2ngulo \u00e9 escaleno");
            }
            if(lado1 == lado2 && lado1 == lado3){
                System.out.print("este tri\u00e2ngulo \u00e9 equil\u00e1tero");
            }
            if((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado1 == lado3)) {
                System.out.print("este tri\u00e2ngulo \u00e9 is\u00f3celes");
            }
        } else {
            System.out.printf("Tri\u00e2ngulo com os lados inseridos \u00e9 inv\u00e1lido!");
        }
    }
}    