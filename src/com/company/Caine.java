package com.company;
import java.util.Scanner;

public class Caine {



    public void AlegeMeniu () {
        System.out.println("Meniul nostru:");
    }





    static void Pizza (){
       System.out.println("PIZZA CU SUNCA");
        System.out.println("PIZZA CAPRICIOSA");
        System.out.println("PIZZA DIAVOLA");
        System.out.println("PIZZA MASCARPONE");
        System.out.println("PIZZA CASCAVAL");

    }

    static void Paste () {
       System.out.println("Paste Carbonara");
        System.out.println("Paste cu ou");
        System.out.println("Paste Bolognese");
        System.out.println("Paste Fierte");
        System.out.println("Paste Scarboase"); }


    static  void Peste () {
        System.out.println("STIUCA");
        System.out.println("CRAP");
        System.out.println("ROSIOARA");
        System.out.println("SFAIUGA");
        System.out.println("RECHIN");
    }
    static   void Alcool () {
        System.out.println("VIN");
        System.out.println("BERE");
        System.out.println("WHISKY");
        System.out.println("ROM");
        System.out.println("PUFOAICA");
    }
    static  void Desert () {
        System.out.println("FRUCTE");
        System.out.println("SAVARINA");
        System.out.println("ECLERE");
        System.out.println("BISCUITI");
        System.out.println("BOMBOANE");
    }


static void SubmeniuPizza(){

}



    public  static void main (String[] args) {
        System.out.println("Bine ati venit la restaurantul nostru! Va prezentam urmatorul meniu");
        System.out.println("1.Pizza");
        System.out.println("2.Paste");
        System.out.println("3.Peste");
        System.out.println("4.Alcool");
        System.out.println("5.Desert");
        System.out.println("Apasati litera corespuinzatoare submeniului dorit");

        int pizza;
        int paste;
        int peste;
        int alcool;
        int desert;

        Scanner scPizza = new Scanner(System.in);
        int toate= scPizza.nextInt();
        
        if (toate == 1) {
            Pizza();
            main(args);}

        if (toate == 2 ) {
            Alcool();

        }

        if (toate == 3) {
            Peste();

        }

        if (toate == 4) {
            Alcool();


        }

        if (toate == 5) {
            Desert();

        }






    }
}
