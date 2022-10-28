/* This is a stub for the Cafe class */
public class Cafe extends Building {

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        new Cafe("Campus Center Cafe", "100 Elm St, Northampton, MA 01063", 3);
    }
    
}
