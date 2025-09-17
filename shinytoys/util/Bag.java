import java.util.Collection;
import java.util.HashMap;

/**
 * Simple 'Bag' class which counts the number of times each unique item is put into it. (e.g. counting occurences of words in text)
 */
public class Bag<E> {
   private HashMap<E, Integer> counts = new HashMap<>();
   public Bag() {}

   /**
    * retrieves the bag's count for the specified item
    * @param item
    * @return the number of times the item has been put into the bag.
    */
   public int get(E item) {
      if (counts.containsKey(item)) {
         return counts.get(item);
      } else {
         return 0;
      }
   }
   
   /**
    * increments (and initializes) the bag's count for the given item
    * @param item
    * @return the previous count
    */
   public int put(E item) {
      int prev = counts.containsKey(item) ? counts.get(item) : 0;
      counts.put(item, prev+1);
      return prev;
   }

   // Overloaded bulk put methods 
   public void put(E[] items) {
      for (E item : items)
         this.put(item);
   }
   public void put(Collection<E> items) {
      for (E item : items)
         this.put(item);
   }

   @Override
   public String toString() {
      return counts.toString();
   }
} 