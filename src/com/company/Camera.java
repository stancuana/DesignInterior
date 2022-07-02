package com.company;

import java.util.ArrayList;

public class Camera extends Mobila{

    private ArrayList<Mobila> mobila;


    public Camera(ArrayList<Mobila> mobila){
        this.mobila=mobila;
    }


    @Override
    public void mutareObiectStangaDreapta(int x) {
        for(Mobila mabila1:mobila){
            mabila1.mutareObiectStangaDreapta(x);
        }
    }

    @Override
    public void mutareObiectSusJos(int y) {
        for(Mobila mabila1:mobila){
            mabila1.mutareObiectSusJos(y);
        }
    }

    @Override
    public void modificareCuloare(Mobila mobila1, String culoareNoua) {

        for(Mobila mabila1:mobila){
            mabila1.modificareCuloare(mobila1,culoareNoua);
        }
    }

    @Override
    public Obiect duplicareObiect() {
        for(Mobila mabila1:mobila){
            mabila1.duplicareObiect();
        }
        return null;
    }

    public void afisare(){

        for(int i=0; i<mobila.size();i++){

            System.out.println(mobila.get(i).toString());
        }
    }
}
