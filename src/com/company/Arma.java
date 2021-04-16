package com.company;

public class Arma extends Soldado {
    private int IdentificadorArma;
    private String nombre;
    private float Ataque;
    private float defensa;
    private float[] dañoArmas = new float[10];
    private String[] armasNombres= new String[10];

    public void dañoMasivo(){
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
    }

    public void nombreArmas(){
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

    @Override
    public void atacar() {

    }

}
