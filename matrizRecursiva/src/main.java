import java.util.Scanner;
public class main {
    static int linhas;
    static int colunas;

    public static void matrizRecursiva(int[][] matriz,int linhas,int colunas){
        if (matriz.length != linhas) {
            System.out.print(matriz[linhas][colunas] + "  ");
            colunas += 1;
            if (matriz[0].length == colunas) {
                linhas += 1;
                colunas = 0;
                System.out.println();
            }
            matrizRecursiva(matriz, linhas, colunas);
        }
    }

    public static void main(String[] args) {
        System.out.println("Insira o tamanho da matriz que deseja criar: ");
        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();
        int colunas = scanner.nextInt();
        int matriz[][] = new int[linhas][colunas];
        int vetor[] = new int[linhas*colunas];
        boolean mudarLinha = false;
        matrizRecursiva(matriz,0,0);
    }
}
