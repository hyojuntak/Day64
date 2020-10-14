import java.util.*;
class Main {
  public static void main(String[] args) {
  
  ArrayList<Integer> point = new ArrayList<Integer>();
  point.add(98);
  point.add(24);
  point.add(56);
  point.add(72);

  Collections.sort(point); //오름차순 
   System.out.println(point);
  Collections.sort(point, Collections.reverseOrder()); //내림차순
 

  for(int i : point){
    System.out.print(i+" ");
  }

  }
}
