package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CameraTest {

    @Test
    public void test(){

        Pat pat=new Pat("Pat",5,6,"alb");
        Dulap dulap=new Dulap("Dulap",10,6,"gri");

        ArrayList<Mobila>mobila=new ArrayList<>();

        mobila.add(pat);
        mobila.add(dulap);


        Camera camera=new Camera(mobila);
        System.out.println("....................AFISARE..................");
        camera.afisare();
        System.out.println("....................MUTARE STANGA DREAPTA.....................");
        camera.mutareObiectStangaDreapta(4);
        camera.afisare();
        System.out.println("...................MUTARE SUS JOS.................");
        camera.mutareObiectSusJos(10);
        camera.afisare();
        System.out.println("...................DUPLICARE.................");
        camera.duplicareObiect();
        camera.afisare();



    }

}