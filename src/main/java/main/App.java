package main;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        
        Hedgehog newhedgehog = new Hedgehog();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1) Pistä siili puhumaan,, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
            
                switch(i){
                    case 1:
                    
                    System.out.println("Mitä siili sanoo: ");
                    String input = sc.
                    nextLine();
                    if(input.equals("")){
                        System.out.println("Olen " + newhedgehog.getName() + " ja ikäni on " + newhedgehog.getAge() + ", mutta saisinko silti syötteen?");
                        break;
                    }else{
                        newhedgehog.speak(input);
                        break;
                    }
                    

                    case 2:
                    System.out.println("Anna Siilin nimi: ");
                    String name = sc.nextLine();
                    System.out.println("Anna Siilin ikä: ");
                     int age = Integer.parseInt(sc.nextLine());
                     newhedgehog = new Hedgehog(name, age);
                     
                     break;

                     case 3:

                     System.out.println("Kuinka monta kierrosta?");
                     int count = Integer.parseInt(sc.nextLine());
                     newhedgehog.run(count);


                     break;
                     case 0:
                     System.out.println("Kiitos ohjelman käytöstä.");
                     exit = true;
                     break;

                     default:
                     System.out.println("Syöte oli väärä.");
                     break;
               }
        
        sc.close();    }
        }
        



    }
}
