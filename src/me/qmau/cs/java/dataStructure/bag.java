import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>  {
  private Node first; // first node in list
  private int N;
  private class Node{
    Item item;
    Node next;
  }
public void add(Item item){
   Node oldfirst = first;
   first = new Node();
   first.item = item;
   first.next = oldfirst;
   N++;
 }
public int size(){
    return N;
}

public Iterator<Item> iterator(){
  return new ListIterator();
 }
private class ListIterator implements Iterator<Item>{
  private Node current = first;

  public boolean hasNext(){
     return current != null;
   }
   public void remove() { }
   public Item next(){
     Item item = current.item;
     current = current.next;
     return item;
   }
 }

  public static void main(String[] args){
    Bag<Double> numbers = new Bag<Double>();
    numbers.add(0.5);
    numbers.add(0.2);
    numbers.add(1.7);
    numbers.add(5.5);
    numbers.add(8.9);
    int N = numbers.size();// n =5
    double sum = 0.0;
    for (double x : numbers)
    sum += x;
    double mean = sum/N; //mean=16.8/5
    sum = 0.0;
    for (double x : numbers)
    sum += (x - mean)*(x - mean);
    double std = Math.sqrt(sum/(N-1));//std =sqrt(56.192/4)
    System.out.printf("Mean: %.2f\n", mean);//mean: 3.36
      System.out.printf("Std dev: %.2f\n", std);//Std dev: 3.75
}
}
