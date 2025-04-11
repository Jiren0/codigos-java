import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        //Declaração de variaveis
        int n1, n2, total;

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora --\n");

        //Entradas
        System.out.println("Soma Simples: ");
        System.out.println("Informe N1:");
        n1 = entrada.nextInt();
        System.out.println("Informe N2");
        n2 = entrada.nextInt();


        //Processamento
        total = n1 + n2;

        //Saida
        System.out.println(n1 + " + " + n2 + " - " + total);

    }
}