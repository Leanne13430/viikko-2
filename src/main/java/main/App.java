package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        // Olio luokasta Hedgehog, jotta voidaan käyttää sen metodit
        Hedgehog hedgehog = new Hedgehog();  
        
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String reply = sc.nextLine();
                        if (!reply.isEmpty()) {
                            hedgehog.speakMethod(reply);
                        } else {
                            System.out.println("Olen " + hedgehog.getName() + " ja ikäni on " + hedgehog.getAge() + " vuotta, mutta antaisitko silti syötteen?");



                        }
                        
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String ageString = sc.nextLine();
                        int age = Integer.parseInt(ageString);

                        hedgehog.setHedgehog(name, age);
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String roundsString = sc.nextLine();
                        int rounds = Integer.parseInt(roundsString);
                        hedgehog.run(rounds);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;








                        

                    








                }

            }
        }




    }

    
    }
