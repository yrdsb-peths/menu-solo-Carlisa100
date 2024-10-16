public class Stack{
   private Node first;
   private class Node {		// Inner Class
      private String item;
      private Node next;
   }
   public boolean isEmpty() {
      return first == null;
   }
   public void push(String item) {
      Node second = first;
      first = new Node();
      first.item = item;
      first.next = second;
   }
   public String pop() {
      String item = first.item;
      first = first.next;
      return item;
   }
   public String peek() {		// What does this do?
      return first.item;
   }
}

