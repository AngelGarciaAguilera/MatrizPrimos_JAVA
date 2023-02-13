/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.matrizprimos;

/**
 *
 * @author mint
 */
public class Matriz {
    
    private int[][] matriz;
    private String[][] matrizPrima;

    public Matriz(){
        matriz = new int[5][5];
        matrizPrima = new String[5][5];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = (int) (Math.random()*100+1); //Número random desde 1 a 100
                if(esPrimo(matriz[i][j])) matrizPrima[i][j] = "S";
                else matrizPrima[i][j] = "N";
            }
        }
    }
    
    public void nuevaMatriz(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = (int) (Math.random()*100+1); //Número random desde 1 a 100
                if(esPrimo(matriz[i][j])) matrizPrima[i][j] = "S";
                else matrizPrima[i][j] = "N";
            }
        }
    }
    public boolean esPrimo(int numero){

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero/2; x++) {
            if (numero % x == 0) return false;
        }
        return true;
    }

    public String matriztoString() {
        String cadena = "";

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(j == 4){
                    cadena += matriz[i][j] + "\n";
                }else{
                    cadena += matriz[i][j] + " ";
                }
            }
        }
        return cadena;
    }
    
    public String primotoString() {
        String cadena = "";

        for(int i = 0; i < matrizPrima.length; i++){
            for(int j = 0; j < matrizPrima.length; j++){
                if(j == 4){
                    cadena += matrizPrima[i][j] + "\n";
                }else{
                    cadena += matrizPrima[i][j] + " ";
                }
            }
        }
        return cadena;
    }
}
