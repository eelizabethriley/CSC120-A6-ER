import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /* Constructor for a House */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /*Accessor for hasDiningRoom value, indicates whether this house has a dining room or not. */
  public boolean getHasDiningRoom() {
    return this.hasDiningRoom;
    }
  
    /*Accessor for nResidents value, returns the number of residents in this house. */
  public int getNResidents() {
    return residents.size();
  }

  public void moveIn(String name) {
    residents.add(name);
  }

  public String moveOut(String name) {
    residents.remove(name);
    return name;
  }

  public boolean isResident(String person) {
    return residents.contains(person);
  }

  /* Main for testing. */
  public static void main(String[] args) {
    House wilson = new House("Wilson", "Northampton MA 0106", 4,false);
    wilson.moveIn("Erin Riley");
    wilson.moveIn("Jenny Yang");

  }

}