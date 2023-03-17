package assignmentJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizaStore cheezPiza = new CheezPizza();
        PizaStore meatLover = new MeatLover();
        PizaStore vegLover = new VegLover();

        PizaStore[] pizza = new PizaStore[5]; // allocating mm for customer of datatype array of 5
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        for(int i =0; i < pizza.length; i++) {
            System.out.println("Please enter your choice:");
            System.out.println("1 - CheezPiza\n2 - MeatLover\n3 - VegLover\n4 Exit ");
            switch(choice){
                case 1:
                    pizza[i] = new CheezPizza();
                    break;
                case 2:
                    pizza[i] = new MeatLover();
                    break;
                case 3:
                    pizza[i] = new VegLover();
                    break;
                default:
                    System.out.println("Exit ");
                    System.out.println("Please provide the item name");
                    pizza[i] = new VegLover();
                    break;

            }
        }
        int total = 0;
        int cheezpizza = 0;
        int meatpizza = 0;
        int vegipizza = 0;

        for(int i = 0; i < pizza.length; i++){
            total = total + pizza[i].getPrice();
            if(pizza[i] instanceof CheezPizza) {
                cheezpizza ++;
            }else if(pizza[i] instanceof MeatLover){
                meatpizza ++;
            }else {
                vegipizza ++;
            }
            System.out.println("The total cost you pay is:" + total + "\n" +
                    "You have ordered :\n" + meatpizza+ "MeatLover \n " +
                     vegipizza + "VegiLover \n" +
                    cheezpizza + "CheezLover");

        }


    }
}
