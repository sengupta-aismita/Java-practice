//stack using arraylist
import java.util.*;
public class ArrList {
    static class Stack{
        static ArrayList<Integer> list  = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;      
          }

          //push
          public static void push(int data){
            list.add(data);
          }
           //pop
           public static int pop(){
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
           }
           //peek
           public static int peek(){
            return list.get(list.size() - 1);
           }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        // Using java Collections Framework we dont need to manually write the functions it is present in Stack<>
        // Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
