

// programa de soluções computacionais.
// Lista 2 ( atividade 11, segunda lista)
//Aluno: João Victor Maia Leite
//RA: 323124931


import java.util.Scanner;
public class atividade11 {
    public static void main(String[] args) throws Exception {
        
              
        
                int area;
                double litros;
                double quantidadeLatas;
                double valorFinal;    
                Scanner input;
                // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
                input = new Scanner(System.in);
                area = input.nextInt();
                // calcular a quantidade de latas de tinta a serem compradas e o preco total
                litros = area / 3;
                quantidadeLatas = Math.ceil( litros / 18 );
                valorFinal = quantidadeLatas * 80;
                // mostrar a quantidade de latas de tinta a serem compradas e o preco total
                System.out.println(quantidadeLatas);
                System.out.println("R$ " + valorFinal);






    }
}
