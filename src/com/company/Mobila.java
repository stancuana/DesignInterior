package com.company;

public class Mobila extends Obiect{

    private String numeObiect;
    private int coordonateX;
    private int coordonateY;
    private String culoare;


    public Mobila(String numeObiect,int coordonateX, int coordonateY,String culoare){

        this.numeObiect=numeObiect;
        this.coordonateX=coordonateX;
        this.coordonateY=coordonateY;
        this.culoare=culoare;
    }

    public Mobila() {
    }


    public String getNumeObiect() {
        return numeObiect;
    }

    public void setNumeObiect(String numeObiect) {
        this.numeObiect = numeObiect;
    }

    public int getCoordonateX() {
        return coordonateX;
    }

    public void setCoordonateX(int coordonateX) {
        this.coordonateX = coordonateX;
    }

    public int getCoordonateY() {
        return coordonateY;
    }

    public void setCoordonateY(int coordonateY) {
        this.coordonateY = coordonateY;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }


    @Override
    public String toString(){

        return "Nume obiect: "+this.numeObiect+"\n"+
                "Coordonata pe x: "+this.coordonateX+"\n"+
                "Coordonata pe y: "+this.coordonateY+"\n"+
                "Culoare: "+this.culoare+"\n";
    }

    @Override
    public boolean equals(Object object){

        Mobila mobila=(Mobila) object;

        return (this.numeObiect.equals(mobila.numeObiect) && this.coordonateX==mobila.coordonateX && this.coordonateY==mobila.coordonateY);
    }


    @Override
    public void mutareObiectStangaDreapta(int x){
        this.coordonateX+=x;
    }

    @Override
    public void mutareObiectSusJos(int y){
        this.coordonateY+=y;
    }

    @Override
    public void modificareCuloare(Mobila mobila,String culoareNoua){

        mobila.setCuloare(culoareNoua);
        mobila.getCuloare();
    }

    @Override
    public Obiect duplicareObiect(){

        return new Mobila(numeObiect,coordonateX,coordonateY,culoare);
    }
}
