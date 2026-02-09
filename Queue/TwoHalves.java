//interleave two halves of a queue
package Queue;
import java.util.*;

public class TwoHalves {

    public static void InterLeave(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();
        int size = q.size();
        for(int i = 0; i < size /2; i++){
            first.add(q.remove());
        }

        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }

    }
    public static void main(String args[]){
       Queue<Integer> q = new LinkedList<>();
       
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      InterLeave(q);
      while(!q.isEmpty()){
        System.out.println(q.remove());
      }
       



       
    }
}
