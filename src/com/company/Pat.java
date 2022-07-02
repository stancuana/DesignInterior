package com.company;

public class Pat extends Mobila{

    public Pat(String numeObiect,int coordonateX, int coordonateY,String culoare){

        super(numeObiect,coordonateX,coordonateY,culoare);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object object) {

        Pat pat=(Pat) object;

        return (super.getNumeObiect().equals(pat.getNumeObiect()) && super.getCoordonateX()== pat.getCoordonateX() && this.getCoordonateY()== pat.getCoordonateY());
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

        Pat pat=(Pat) mobila;

        pat.setCuloare(culoareNoua);
        pat.getCuloare();
    }

    @Override
    public Obiect duplicareObiect() {
        return new Pat(super.getNumeObiect(),super.getCoordonateX(),super.getCoordonateY(),super.getCuloare());
    }
}
