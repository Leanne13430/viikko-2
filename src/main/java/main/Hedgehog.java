package main;

public class Hedgehog {
    private String name;
    private int age;

    // Oletusrakentaja
    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;

    }
    // siili puhuu metodi
    public void speakMethod(String printed) {
        System.out.println(this.name + ": " + printed);
        
    }
    // Asetetaan siilille nimi ja ikä, tämä on rakentajametodi. Rakentaja metodi mahdollista private jäsen muuttujien käyttöön
    // toisessa luokassa
    public void setHedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Tuodaan uusi nimi ja ikä toiselle tiedostolle
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    // run metodi
    public void run(int num) {
        for(int i = 1; i <= num; i++) {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    
    }



    
}
