package com.mycompany.main;
import java.util.Scanner;
import java.util.Random;


public class MAIN {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int valorPelota1, valorPelota2, valorPelota3, valorPelota4,valorTotal1,valorTotal2;
        String colorPelota1, colorPelota2, colorPelota3, colorPelota4;
        String nombrePrimerJugador, nombreSegundoJugador;
        
        System.out.print("Introduzca el nombre del primer jugador ");
        nombrePrimerJugador = sc.nextLine();
        
        colorPelota1 = generarColor1();
        colorPelota2 = generarColor2();
        colorPelota3 = generarColor3();
        colorPelota4 = generarColor4();
        
        valorPelota1 = generarValor1();
        valorPelota2 = generarValor2();
        valorPelota3 = generarValor3();
        valorPelota4 = generarValor4();
        valorTotal1 = valorPelota1 + valorPelota2;
        valorTotal2 = valorPelota3 + valorPelota4;
        
      
        System.out.println("el jugador" + " " + nombrePrimerJugador + " " + "saco una primer bola de color" + " " + colorPelota1 + " " + "con un valor de" + " " + valorPelota1 + " " + "y saco una segunda pelota con el color" + " " + colorPelota2 + " " + "con un valor de" + " " + valorPelota2);
        
        System.out.print("Introduzca el nombre del segundo jugador ");
        
        nombreSegundoJugador = sc.nextLine();
        
        System.out.println("el jugador" + " " + nombreSegundoJugador + " " + "saco una primer bola de color" + " " + colorPelota3 + " " + "con un valor de" + " " + valorPelota3 + " " + "y saco una segunda pelota con el color" + " " + colorPelota4 + " " + "con un valor de" + " " + valorPelota4);
       
     
        if (colorPelota1.equals(colorPelota2)) {
             valorTotal1 = valorPelota1 + valorPelota2;
             System.out.println("El valor total de la suma de las pelotas de " + nombrePrimerJugador + " " + "es" + " " + valorTotal1);
    }   else {
            valorTotal1 = 0;
             System.out.println("El valor total de la suma de las pelotas de " + nombrePrimerJugador + " " + "es" + " " + "0 ya que son distintas");
            }
        
        if (colorPelota3.equals(colorPelota4)) {
             valorTotal2 = valorPelota3 + valorPelota4;
             System.out.println("El valor total de la suma de las pelotas de " + nombreSegundoJugador + " " + "es" + " " + valorTotal2);
    }   else{
            valorTotal2 = 0;
             System.out.println("El valor total de la suma de las pelotas de " + nombreSegundoJugador + " " + "es" + " " + "0 ya que son distintas");
            }
       
       if (valorTotal1 > valorTotal2) {
           System.out.println("El jugador " + nombrePrimerJugador + " gano por mayor valor" );
       } else if (valorTotal1 < valorTotal2){
           System.out.println("El jugador " + nombreSegundoJugador + " gano por mayor valor");
       } else if (valorTotal1 == valorTotal2){
               System.out.println("Los jugadores empataron");
               }
      
    }
    public static String generarColor1() {
        String[] colores = {"azul", "rojo"};
        Random random = new Random();
        int indice = random.nextInt(colores.length);
        return colores[indice];
    }     
    public static String generarColor2() {
        String[] colores = {"azul", "rojo"};
        Random random = new Random();
        int indice = random.nextInt(colores.length);
        return colores[indice];
    }
    public static String generarColor3() {
        String[] colores = {"azul", "rojo"};
        Random random = new Random();
        int indice = random.nextInt(colores.length);
        return colores[indice];
    }
    public static String generarColor4() {
        String[] colores = {"azul", "rojo"};
        Random random = new Random();
        int indice = random.nextInt(colores.length);
        return colores[indice];
    }
        public static int generarValor1() {
        Random random = new Random();
        return random.nextInt(11); 
    }
                public static int generarValor2() {
        Random random = new Random();
        return random.nextInt(11); 
    }
                        public static int generarValor3() {
        Random random = new Random();
        return random.nextInt(11); 
    }
        public static int generarValor4() {
        Random random = new Random();
        return random.nextInt(11); 
    }
 }
   

      