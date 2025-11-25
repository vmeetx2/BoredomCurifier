import java.util.*;
public class queuerun{
public static void main(String[] args){
    Queue<String> queuetest = new LinkedList<String>();
queuetest.offer("Karen");
queuetest.offer("Chad");
queuetest.offer("Jimmy");
queuetest.offer("Harold");

while (!queuetest.isEmpty())
{
    queuetest.poll();
}
System.out.println(queuetest);
}
}
