/* Receber 5 números inteiros aleatórios de um array A e ordená-los em ordem crescente em um array B. */
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i=0; i < numeros.length; i++){
            System.out.println("Digite 5 números:");
            numeros[i] = leitor.nextInt();
        }

        int[] crescente = new int[5];

        for(int i = 0; i<5; i++){
            crescente[i] = numeros[i];
        }

        for(int i = 0; i<5; i++){
            for(int j = i + 1; j<5; j++){
                if(crescente[i] > crescente[j]){
                    int aux = crescente[i];
                    crescente[i] = crescente[j];
                    crescente[j] = aux;
                }
            }
        }

        for(int i=0; i<numeros.length;i++){
            System.out.println(numeros[i] + " " + crescente[i]);
        }
        leitor.close();
    }
}


