
interface CallBack{
    void show();
}


public class Client implements CallBack{
     public void show(){
        System.out.println("happy!");
     }
    
    
}

public class Try2{
    public static void main(String args[]){
       Client c = new Client();
       c.show();
    }
}
