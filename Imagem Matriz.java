package exerciciossala;
import java.util.Scanner;
public class d3005ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        //DESENHOOOO
        int caderno[][] = new int[16][16];// declarando a variavel matriz
        int i, j;
        
        System.out.printf("Pintura digital!\n");
        System.out.printf("==== Menu de cores ====\n (0) - Branco\n (1) - Preto\n (2) - Vermelho\n (3) - Bege\n");//exibindo menu 
        
        for(i=0; i < 16; i++)// criando laço de repetição da matriz
        {
            for(j=0; j < 16; j++)
            {
                System.out.printf("\nDigite o numero referente a cor que voce deseja pintar a posição %dx%d da matriz: ", i, j);
                caderno[i][j] = ler.nextInt(); //lendo a cor desejada e salvando na posição adquada na matriz
            }
        }
        
        for(i=0; i < 16; i++)// laço de repetição para exibir a matriz
        {
            System.out.printf("\n");
            for(j=0; j < 16; j++)
            {
                System.out.printf(" %d", caderno[i][j]);//imprimindo a matriz
                 
            }
        }

    }
}