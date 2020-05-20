 public static void main (String[] args) {
  
    //list of Integers
    BasicListWithIterator<Integer> myList = new BasicListWithIterator<>();
    BasicIterator it = myList.getIterator();
    
    //empty list
    if(myList.isEmpty()) {
      System.out.println("Liste leer: " + myList);
      System.out.println("hasNext: " + it.hasNext());
    }
    else {
      System.out.println("Liste nicht leer: " + myList);
      System.out.println("hasNext: " + it.hasNext());
    }
    
    //list filled with elements
    for (int i = 1; i <= 6; i++)
      myList.insert(2 * i + 1);
    System.out.println("Liste nach insert:   " + myList);
    System.out.print("Liste mit Iterator durchlaufen: \n  ");
    it = myList.getIterator();
    while (it.hasNext())
      System.out.print(it.getNext() + " / ");
    System.out.println("\n"); 
    
    //some elemets deleted from list
    for (int i = 1; i <= 6; i++)
      myList.delete(i);
    System.out.println("Liste nach delete:   " + myList.toString());
    System.out.print("Liste mit Iterator durchlaufen: \n  ");
    it = myList.getIterator();
    while (it.hasNext())
      System.out.print(it.getNext() + " / ");
    System.out.println(); 
     
  }
}
