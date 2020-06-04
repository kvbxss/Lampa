package com.company;

class Lampa{
    boolean CzySwieci;

     public void wlacz(){
        this.CzySwieci=true;
    }
     public void wylacz(){
        this.CzySwieci=false;
    }
    public void wypisz(){
         if (CzySwieci){
             System.out.println("Swieci");
        }
         else
         {
             System.out.println("Nie Swieci");
         }
    }
}
public class Main {

    public static void main(String[] args) {

        Lampa lampa = new Lampa();
        Lampa lampa2 = new Lampa();

        lampa.wlacz();
        lampa.wypisz();

        lampa2.wlacz();
        lampa2.wypisz();

        lampa2.wylacz();
        lampa2.wypisz();
    }
}
