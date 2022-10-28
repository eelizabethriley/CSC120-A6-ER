/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams || this.nCups == 0) {
            this.restock(size, nSugarPackets, nCreams);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups --;
        System.out.println(size + " oz coffee with " + nSugarPackets + " sugar(s) and " + nCreams + " cream(s) has been sold. Thank you!");
    }
    
    private void restock(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces += size;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups ++;
        System.out.println("Successfully restocked the Cafe.");
    }
    
    public static void main(String[] args) {
        Cafe ccCafe = new Cafe("Campus Center Cafe", "100 Elm St, Northampton, MA 01063", 3, 50, 10, 20, 20);
        ccCafe.sellCoffee(12, 1, 2);
    }
    
}
