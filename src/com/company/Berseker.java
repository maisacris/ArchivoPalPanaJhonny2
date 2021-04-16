package com.company;

import java.util.Scanner;

public class Berseker extends Soldado implements Armas {

    private int armaEscogidaXD;
    private int indentificador;
    private String nombreDeBatalla;
    private String nombre;
    private float fuerzaBerserker = 10;
    private float[] dañoArmas = new float[10];
    private String[] armasNombres= new String[10];
    private int j;

    @Override
    public void atacar() {

        Scanner i = new Scanner(System.in) ;
        this.dañoArmas[0] = 32; //espada
        this.dañoArmas[1] = 35; //hacha
        this.dañoArmas[2] = 55; //ballesta
        this.dañoArmas[3] = 10; //daga
        this.dañoArmas[4] = 36; //alabarda
        this.dañoArmas[5] = 28; //cuchillo
        this.dañoArmas[6] = 15; //lanza
        this.dañoArmas[7] = 20; //arco largo
        this.dañoArmas[8] = 45; //hacha de dos manos
        this.dañoArmas[9] = 40; //espadon


        System.out.println("|---------------------------------------|");
        System.out.println("|          ESCOJA EL NUMERO             |");
        System.out.println("|              DEL ARMA                 |");
        System.out.println("|---------------------------------------|");
        System.out.println("| 0. Espada         |   1. hacha        |");
        System.out.println("| 2. Ballesta       |   3. Daga         |");
        System.out.println("| 4. Alabarda       |   5. Cuchillo     |");
        System.out.println("| 6. Lanza          |   7. Arco largo   |");
        System.out.println("| 8. hacha de       |   9.Espadon       |");
        System.out.println("|   dos manos       |                   |");
        System.out.println("|_______________________________________|");

        j = i.nextInt();
        fuerzaBerserker = fuerzaBerserker + dañoArmas[j];
        System.out.println("El daño total es de: " + fuerzaBerserker);
    }

    public int getIndentificador() {
        return indentificador;
    }
    public void setIdentificador(int indentificador){
        this.indentificador = indentificador;
    }

    public String getNombreDeBatalla(){
        return nombreDeBatalla;
    }
    public void setNombreDeBatalla(String nombreDeBatalla){
        this.nombreDeBatalla = nombreDeBatalla;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }




    @Override
    public void dañoFinal() {


    }

    @Override
    public void nombreArma() {
        this.armasNombres[0] = "espada";
        this.armasNombres[1] = "hacha";
        this.armasNombres[2] = "ballesta";
        this.armasNombres[3] = "daga";
        this.armasNombres[4] = "alabarda";
        this.armasNombres[5] = "cuchillo";
        this.armasNombres[6] = "lanza";
        this.armasNombres[7] = "arco largo";
        this.armasNombres[8] = "hacha de dos manos";
        this.armasNombres[9] = "espadon";
    }
}
