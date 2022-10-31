/** A Building class representing a building with a name, address, and nFloors.
 * Has methods getName, getAddress, getFloors, and toString.
*/
public class Building {

    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    
    /** Constructor for the Building class.
     * @param name the name of the building
     * @param address the address of this building's location.
     * @param nFloors the number of floors in this building.
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Accessor for the Building's name.
     * @return the name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor for the Building's address.
     * @return the address of this building.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor for the Building's number of floors.
     * @return the number of floors in this building.
     */
    public int getFloors() {
        return this.nFloors;
    }
    
    /** 
     * Concatenates the building's name, num floors, and address into a string.
     * @return the attributes of this building as a string.
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}