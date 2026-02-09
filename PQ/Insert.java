package PQ;
import java.util.*;

public class Insert {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);
            int x = arr.size()-1; //x is child index
            int par = (x-1)/2; //par index

            while(arr.get(x) < arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }

        }

        public int peek(){
           return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int min = i;
            if(left< arr.size() && arr.get(min)> arr.get(left)){
                min = left;
            }
            if(right < arr.size() && arr.get(min)> arr.get(right)){
                min = right;
            }
            if(min != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);
            }

        }

        public int remove(){
            int data = arr.get(0);

            //swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size() - 1, temp);

            //delete last
            arr.remove(arr.size()-1);
            //fix heap
            heapify(0);
            return data;


        }

        private void heapify(int idx){
            int left = 2*idx+1;
            int right = 2*idx  + 2;
            int minIdx = idx;
            if(left< arr.size() && arr.get(minIdx)> arr.get(left)){
                minIdx = left;
            }

        }
        public int remove(){
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size() - 1);

        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String args[]){
            Heap h = new Heap();
            h.add(3);
            h.add(4);
            h.add(1);
            while(!h.isEmpty()){
                System.out.println(h.peek());
                h.remove();
            }
    }
}
