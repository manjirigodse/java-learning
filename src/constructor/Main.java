package constructor;

public class Main {

    static Virus virus;

    Main(){
        this.virus = new Virus("na",20);
    }
//    int size1 = virus.size;


    public static void main(String[] args) {

//        virus = new Virus("na",9);
        Main main1 = new Main();
        int size1 = main1.virus.size;
        System.out.println(size1);

        Virus v1 = Virus.getVirus(1, "Covid");

        Virus v2 = Virus.getVirus(1, "Corona");
        System.out.println(v2 + " " + v2.name + " " + v2.size);
        System.out.println(v1 + " " + v1.name + " " + v1.size);

        Virus v3 = Virus.getVirus(1, "Covid 19");
        System.out.println(v3 + " " + v3.name + " " + v3.size);

        Virus v4 = Virus.getVirus2(18, "Karina");
        System.out.println(v4 + " " + v4.name + " " + v4.size);

        Virus v5 = new Virus("Ebola" , 25);
        Virus v6 = new Virus(v5);

        System.out.println(v6.size + " " + v6.name);

        Virus v8 = new Virus("Chikungunia", 10, "red");
        System.out.println(v8.name + " " + v8.size + " " + v8.colour);

    }
}
