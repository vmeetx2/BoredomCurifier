import java.util.*;
public class linkedlist{
    public static void main(String[] args){

        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        linkedlist.poll();
        linkedlist.addFirst("K");

        
        linkedlist.add(3, "E");
        System.out.println(linkedlist);
        System.out.println(linkedlist.indexOf("F"));
    }
}

