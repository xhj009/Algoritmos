package Inserccion;

import java.util.Arrays;

public class Inserccion {

    public static int[] inserccion(int numerosAOrdenar[]){
        int length = numerosAOrdenar.length;
        int tmp = 0;
        int iterar = 0;

        for (int i = 0; i < length ; i++) {
            iterar = i;
            tmp = numerosAOrdenar[i];

            while (iterar > 0 && numerosAOrdenar[iterar - 1] > tmp  ){
                numerosAOrdenar[iterar] = numerosAOrdenar[iterar -1 ];
                iterar--;
            }
            numerosAOrdenar[iterar] = tmp;
        }
        return numerosAOrdenar;
    }

    public static void main(String[] args) {
        int numerosAOrdenar [] = {5,3,4,1,2};
        int numerosOrdenados [] = inserccion(numerosAOrdenar);
        System.out.println(Arrays.toString(numerosOrdenados));
    }
}
