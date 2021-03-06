package insertsort;

import insertsort.gui;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
    public static void main(String a[]) {

        int max = 100;
        int top = 500;

        Date zacatek = new Date();

        int[] array1 = new int[max];
        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*top + 1);
        }
        System.out.println("Vygenerovana cisla: " + Arrays.toString(array1));


        int[] array2 = BSort(array1);
        for(int i:array2) {
            System.out.print(i);
            System.out.print(", ");
            /*System.out.println("  //DEBUG: Nacten array");*/
        }

        Date konec = new Date();
        long rozdil = konec.getTime() - zacatek.getTime();
        System.out.println(rozdil + " milisekund");
        System.out.println("Pole o délce " + max + " náhodných čísel a maximálním číslu " + top + " bylo seřazeno za " + rozdil + " milisekund");

    }

    public static int[] BSort(int[] inputBubble) {
        for (int i = 0; i < inputBubble.length - 1; i++) {
            for (int j = 0; j < inputBubble.length - i - 1; j++) {
                if(inputBubble[j] < inputBubble[j+1]) {
                    int tmp = inputBubble[j];
                    inputBubble[j] = inputBubble[j+1];
                    inputBubble[j+1] = tmp;
                }
            }
        }
        return inputBubble;
    }
}

