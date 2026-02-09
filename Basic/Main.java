class A {
    int n;
    public void define(int a){
        n = a;
    }

    public boolean isPrime(){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
              if(n % i  == 0)
                return false;
        } 
        return true;
       
    }

}
public class Main{
    public static void main(String args[]){
        A obj = new A();
        obj.define(5);
        if(obj.isPrime()){
          System.out.println(obj.n + " is prime");
        }
        else{
            System.out.println(obj.n + " is not prime");
        }
        
    }
}
