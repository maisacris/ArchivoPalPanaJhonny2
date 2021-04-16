package com.company;
import javax.swing.*;
import java.util.Scanner;
public class Batallon implements ListaSoldados {

    private int i,j;


    public void agregarBerseker(int posicion) throws ArrayIndexOutOfBoundsException{

        String [][] matrizDeVikingos = new String[6][3];

        //nombres
        if(posicion > 0 && posicion <= 6 ){
            throw new ArrayIndexOutOfBoundsException();
        }

        matrizDeVikingos[0][0]=" identificador: 1";
        matrizDeVikingos[1][0]=" identificador: 2";
        matrizDeVikingos[2][0]=" identificador: 3";
        matrizDeVikingos[3][0]=" identificador: 4";
        matrizDeVikingos[4][0]=" identificador: 5";
        matrizDeVikingos[5][0]=" identificador: 6";

        matrizDeVikingos[0][1]=" Nombre: Bjorn";
        matrizDeVikingos[1][1]=" Nombre: Ubda";
        matrizDeVikingos[2][1]=" Nombre: Daven";
        matrizDeVikingos[3][1]=" Nombre: egil";
        matrizDeVikingos[4][1]=" Nombre: Einar";
        matrizDeVikingos[5][1]=" Nombre:Sven";

        matrizDeVikingos[0][2]=" Apodo:el lobo solitario";
        matrizDeVikingos[1][2]=" Apodo:el vagabundo loco";
        matrizDeVikingos[2][2]=" Apodo: el deshuesado";
        matrizDeVikingos[3][2]=" Apodo:el afortunado";
        matrizDeVikingos[4][2]=" Apodo:el vidente";
        matrizDeVikingos[5][2]=" Apodo:el hacha sangrienta";

        Scanner pregunta = new Scanner(System.in);
        do{
            JOptionPane.showMessageDialog(null,"Berserkes a ver puede elegir, de 1 a 6");
            posicion = pregunta.nextInt();

            for(i=0;i < 3;i++) {
                for (j =0; j<= posicion;j++){

                    System.out.print(" "+ matrizDeVikingos[j][i]);

                }
                System.out.println(" ");
            }


            i=Integer.parseInt(JOptionPane.showInputDialog("desea seguir viendo la informacion . si marque <1>, no marque <2>"));
        }while (this.i==1);


    }

    @Override
    public void agregarBerseker() {

    }

    @Override
    public void eliminarBerserker() {

    }

    @Override
    public void obtenerBerserker() {

    }
}
