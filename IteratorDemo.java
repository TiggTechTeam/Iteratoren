/*************************************************** 
Class IteratorDemo: simple class for demonstrating
  iterator operations with collection classes

UV Objektorientierte Programmierung / H.Hagenauer
***************************************************/

import java.util.*;  //import from package java.util

public class IteratorDemo {

  public static void main (String[]args) {
    
    //List
    System.out.println("interface List<E>");
    ArrayList<String> sList = new ArrayList<>();
    sList.add("ArrayList");
    sList.add("LinkedList");
    sList.add("ArrayList");
    sList.add(0, "Collection Classes");
    System.out.println(" slist - Elementanzahl: " + sList.size());
    displayAll(sList);
    if (sList.contains("ArrayList"))
      sList.remove("ArrayList");
    displayAll(sList);

    //Queue
    System.out.println("\ninterface Queue<E>");
    PriorityQueue<Circle> cQueue = new PriorityQueue<>();
    cQueue.add(new Circle(7.7));
    cQueue.add(new Circle(2.5));
    cQueue.add(new Circle(4.0));
    System.out.println(" cQueue - Elementanzahl: " + cQueue.size());
    displayAll(cQueue);
    System.out.println(" Kopfelement entfernen: " + cQueue.remove().toString());
    displayAll(cQueue);    
        
    //Set
    System.out.println("\ninterface Set<E>");
    HashSet<String> sSet = new HashSet<>();
    sSet.add("Programming");
    sSet.add("Data Bases");
    sSet.add("Software");
    displayAll(sSet);
    sSet.add("Data Bases");
    displayAll2(sSet);
  }
  
  //displaying all elements of collection classes - iterator
  public static <E> void displayAll(Collection<E> c){
    Iterator<E> it = c.iterator();
    while (it.hasNext())
      System.out.println(" " + it.next());
    System.out.println();
  }

  //displaying all elements of collection classes - for-each
  public static <T> void displayAll2(Collection<T> c){
    for (T el : c)
      System.out.println(" " + el);
    System.out.println();
  }

}
