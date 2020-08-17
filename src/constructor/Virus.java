package constructor;

public class Virus {
    int size;
    String name;
    String colour;

    static Virus v = new Virus();

    private Virus() {
        size = 10;
        name = "covid";
        System.out.println(size);
    }

    private Virus(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public Virus(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public Virus(String name, int size, String colour) {
        this(name,size);
        this.colour = colour;
    }

    public Virus(Virus v) {
        this.size = v.size;
        this.name = v.name;
    }


    public static Virus getVirus(int size, String name) {
        v.size = size;
        v.name = name;
        return v;
    }

    public static Virus getVirus2(int size, String name) {
        return new Virus(size, name);
    }
}
