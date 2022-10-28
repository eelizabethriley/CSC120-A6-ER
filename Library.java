import java.util.Hashtable;
import java.util.Map;

/* This is a stub for the Library class */
public class Library extends Building {

    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
  
    public void addTitle(String title) {
      collection.put(title, true);
      System.out.println(title + " has ben added to " + this.getName() + "'s collection.");
    }

    public void removeTitle(String title) {
      collection.remove(title);
      System.out.println(title + " has been removed from " + this.getName() + "'s collection.");
    }

    public void checkOut(String title) {
      collection.replace(title, true, false);
      System.out.println("Successfully checked out the title " + title + " from " + this.getName() + ". Thank you!");
    }

    public void returnBook(String title) {
      collection.replace(title, false, true);
      System.out.println("Succesfully returned the title " + title + " to " + this.getName() + ". Thank you!");
    }

    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title) {
      return collection.get(title);
    }

    public void printCollection() {
      // Use a for-each loop to iterate through the Hashtable as found in the following article: https://www.geeksforgeeks.org/hashtable-in-java/
      int i = 1;
      for (Map.Entry<String, Boolean> book : collection.entrySet()) {
        System.out.println(i + ". --- Title: " + book.getKey() + "\n" + "       Available?: " +  book.getValue());
        i++;
      }
    }

    public static void main(String[] args) {
      Library neilson = new Library("Neilson", "7 Neilson Drive, Northampton MA 01063", 4);
      neilson.addTitle("Pride and Prejudice by Jane Austen");
      neilson.addTitle("The Bell Jar by Sylvia Plath");
      neilson.checkOut("Pride and Prejudice by Jane Austen");
      neilson.removeTitle("The Bell Jar by Sylvia Plath");
      neilson.addTitle("The House on Mango Street by Sandra Cisneros");
      neilson.checkOut("The House on Mango Street by Sandra Cisneros");
      neilson.returnBook("Pride and Prejudice by Jane Austen");
      neilson.printCollection();
    }
  
  }