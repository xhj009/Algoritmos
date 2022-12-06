package Burbuja;

import java.util.Arrays;

public class Burbuja {

    public static int[] ordenamientoBurbuja(int numerosAOrdenar []){
        int length = numerosAOrdenar.length;
        int tmp = 0;

        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length - 1 ; j++) {
                if (numerosAOrdenar[j] > numerosAOrdenar[j+1]){
                    tmp = numerosAOrdenar[j];
                    numerosAOrdenar[j] = numerosAOrdenar[j+1];
                    numerosAOrdenar[j+1] = tmp;
                }
            }
        }
        return numerosAOrdenar;
    }

    public static void main(String[] args) {
        int numerosAOrdenar [] = {9,8,7,6,5,4,3,2,1};
        int numerosOrdenados[] = ordenamientoBurbuja(numerosAOrdenar);

        System.out.println(Arrays.toString(numerosOrdenados));
    }
}
