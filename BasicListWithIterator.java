
public class BasicListWithIterator<E> {

  private Node head;
  
  
  //constructor: creats an empty list
  public BasicListWithIterator () {
    head = null;
  }
  
  
  //inserts an element at the head of the list
  public void insert (E d) {
    Node p = new Node(d);
    p.next = head;
    head = p;
  }
  
  
  //test if data d is in list
  public boolean contains (E d) {
    Node p = head;
    while (p != null && !p.data.equals(d))
      p = p.next;
    
    return p != null; //p == null || p.data.equals(d)
  }
  
  
  //delete data d if in list
  public void delete (E d) {
    Node p = head;
    Node prev = null;
    
    while(p != null && !p.data.equals(d)){
      prev = p;
      p = p.next;
    }
    
    //p == null || p.data.equals(d)
    if(p != null)
      if(p == head)
        head = p.next;
      else
        prev.next = p.next;
    
  }
  
  
  //test if list is empty
  public boolean isEmpty () {
    return head == null;
  }
  
  
  //for demo purposes
  public String toString () {
    String s = "[";
    Node p = head;
    if (p != null){  //adding first element to s
      s = s + p.data.toString();
      p = p.next;
    }

    while(p != null){  //adding remaining elements to s
      s = s + ", " + p.data.toString();
      p = p.next;
    }
    s = s + "]";
    return s;
  }
  
  public BasicIterator<E> getIterator () {
    return new MyIterator();
  }
  
  
  /*************************************************** 
  Inner class Node: for creating dynamic lists of elements
  of Type E
  ***************************************************/

  private class Node {
  
    E data;
    Node next;
  
    Node (E d) {
      data = d;
      next = null;
    }
  }

  /*************************************************** 
  Inner class MyIterator: implements the interface 
  BasicIterator for iterating the elements of this list
  ***************************************************/
  
  private class MyIterator implements BasicIterator<E> {
    Node now;
    
    MyIterator () {
      now = null;
    }
    
    //test if there exists a next element
    public boolean hasNext () {
      if (now == null)
        return head != null;
      else
        return now.next != null;
    }
    
    //moves the iterator to the next element and returns its data
    // requires: hasNext() for existence test of next element!
    public E getNext () {
      if (now == null)
        now = head;
      else
        now = now.next;
      return now.data;
    }
  }  
  
}
