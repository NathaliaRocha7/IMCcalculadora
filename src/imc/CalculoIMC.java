

/*
 * Calculo IMC
 * 
 */
package imc;
import java.util.Scanner;
public class CalculoIMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float altura;
        float peso;
        float IMC;

        System.out.println("Digite sua altura");
        altura = teclado.nextFloat();
        System.out.println("Digite seu peso");
        peso = teclado.nextFloat();
        //*IMC = Peso ÷ (Altura × Altura)
        IMC = peso / (altura * altura);
        System.out.printf("IMC = " + "%.2f", IMC);
        
        if(IMC <= 18.4){
        System.out.println("\nAbaixo do peso esperado para sua altura");
    }
        else if(IMC >= 18.5 && IMC <= 24.9){
        System.out.println("\nPeso esperado para sua altura");
    }
        else if(IMC >= 25.0 && IMC <= 29.9){
        System.out.println("\nAcima do peso esperado para sua altura");
    }
         else if(IMC > 30.0 && IMC <= 34.9){
        System.out.println("\nObesidade 1");
    }
         else if(IMC >= 35.0 && IMC <= 39.9){
        System.out.println("\nObesidade 2");
    }
           else{
        System.out.println("\nObesidade 3");
    } 
    }
}
