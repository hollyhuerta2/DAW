package org.example;
import java.util.Arrays;

public class Buscador {
    public static void main(String[]args){
        int intArray[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        int busqueda1 = Arrays.binarySearch(intArray, 8);
        int b2 = Arrays.binarySearch(intArray, 4);
        int b3 = Arrays.binarySearch(intArray, 22);

        if(busqueda1>=20){
            System.out.printf("¡el elemento no se encuentra en el arreglo!\n");

        }else{   System.out.printf("si se encuentra en el arreglo\n");
            System.out.println(" el elemento se encuentra en la ubicación: "+busqueda1);

        }
        if(b2>=20){
            System.out.printf("¡el elemento no se encuentra en el arreglo!\n");

        }else{   System.out.printf("si se encuentra en el arreglo\n");
            System.out.println(" el elemento se encuentra en la ubicación: "+b2);

        }
        if(b3<=20){
            System.out.printf("¡el elemento no se encuentra en el arreglo!\n");

        }else{   System.out.printf("si se encuentra en el arreglo\n");
            System.out.println(" el elemento se encuentra en la ubicación: "+b3);

        }

        for(int i: intArray){
            System.out.println(i);
        }

    }
}
