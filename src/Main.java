public class Main {
    public static void main (String[] args){
    int [][] numero = new int[3][3];

    numero[0][0] = 5;
    numero[0][1] = 4;
    numero[0][2] = 3;

    numero[1][0] = 4;
    numero[1][1] = 15;
    numero[1][2] = 20;

    numero[2][0] = 2;
    numero[2][1] = 0;
    numero[2][2] = 3;

    for (int i = 0; i < numero.length; i++){
        for (int j = 0; j < numero[i].length; j ++){
            System.out.print(numero[i][j] + " ");
        }
        System.out.println();
    }
    }
}