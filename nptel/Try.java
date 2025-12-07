
public class Try {
    public static void main(String[] args) {
        Y.display();
    }
}

class X {
    static {
        Y.display();
    }
}

class Y extends X {
    static void display() {
        System.out.println("Java");
    }
}
