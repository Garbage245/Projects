import java.util.ArrayList;

public class Asn5{
   public static void main(String[] args) {
      // initialize arraylists
      ArrayList<String> list1 = new ArrayList<String>();
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      
      // add ["I", "really", "hate", "Java"] to list1
      list1.add("I");
      list1.add("really");
      list1.add("hate");
      list1.add("Java");

      // add [6, 7, 8, 9] to list2
      for (int x = 6; x < 10; x++){
         list2.add(x);
      }

      // displays the content of list1 and list2
      System.out.print("List 1: [");
      for (String word : list1){
         System.out.print(word);
         if (list1.indexOf(word) == list1.size() -1){
            System.out.println("]");
         }
         else{
            System.out.print(", ");
         }
      }
      System.out.print("List 2: [");
      for (int x = 0; x < list2.size(); x++){
         System.out.print(list2.get(x));
         if (x == list2.size() - 1){
            System.out.println("]");
         }
         else{
            System.out.print(", ");
         } 
      }

      // makes list1 and list2 empty and checks if they are empty
      list1.clear();
      list2.clear();
      System.out.println("Removing elements from list 1 and list 2");
      System.out.println("Is list 1 empty? " + list1.isEmpty());
      System.out.println("Is list 2 empty? " + list1.isEmpty());
   }
}
