import java.util.Scanner;

public class funcionarios {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //  lista de funcionarios com 4 valores
        String []  funcionarios =new String [4];
        funcionarios [0] = "jose";
        funcionarios [1] = "josefa";
        funcionarios [2] = "jefferson";
        funcionarios [3] = "jroger";

        //Percorrer uma lista e mostrar os nomes
        for (String item : funcionarios){
            System.out.println(item);
        }

    }
}