package com.company;

public class Dulap extends Mobila{


    public Dulap(String numeObiect,int coordonateX, int coordonateY,String culoare){

        super(numeObiect,coordonateX,coordonateY,culoare);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object object) {

        Dulap dulap=(Dulap) object;

        return (super.getNumeObiect().equals(dulap.getNumeObiect()) && super.getCoordonateX()== dulap.getCoordonateX() && this.getCoordonateY()== dulap.getCoordonateY());
    }



    @Override
    public void mutareObiectStangaDreapta(int x) {
        super.mutareObiectStangaDreapta(x);
    }

    @Override
    public void mutareObiectSusJos(int y) {
        super.mutareObiectSusJos(y);
    }

    @Override
    public void modificareCuloare(Mobila mobila, String culoareNoua) {

        Dulap dulap=(Dulap) mobila;

        dulap.setCuloare(culoareNoua);
        dulap.getCuloare();
    }

    @Override
    public Obiect duplicareObiect() {
        return new Dulap(super.getNumeObiect(),super.getCoordonateX(),super.getCoordonateY(),super.getCuloare());
    }
}
