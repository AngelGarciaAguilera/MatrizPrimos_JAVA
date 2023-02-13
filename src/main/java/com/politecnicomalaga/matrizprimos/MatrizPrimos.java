/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.matrizprimos;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class MatrizPrimos {

    public static void main(String[] args) {

        Matriz matriz = new Matriz();
        //int[][] matriz = new int[5][5];
        //String[][] matrizPrima = new String[5][5];

        Scanner sc = new Scanner(System.in);

        String opcion;
        boolean menu = true;
        
        while(menu){
            System.out.println("-------------------------------------------------");
            System.out.println("");
            System.out.println("OPCIONES:");
            System.out.println("1. Crear matriz.");
            System.out.println("2. Mostrar matriz.");
            System.out.println("3. Comprobar números primos.");
            System.out.println("Otra tecla: SALIR.");
            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("Escoja la tarea a realizar:");
            
            opcion = sc.next();
            sc.reset();
            
            System.out.println("-------------------------------------------------");
            
            switch (opcion) {
                case "1":
                    matriz.nuevaMatriz();
                    System.out.println("Matriz creada satisfactoriamente.");
                    
                break;//LISTO
                    
                case "2":
                    System.out.println(matriz.matriztoString());

                break;//LISTO

                case "3":
                    System.out.println(matriz.primotoString());

                break;//LISTO
                
                default:
                    sc.close(); //Cierro la entrada de teclado.
                    menu = false;
                break;
            }
        }
    }
}
