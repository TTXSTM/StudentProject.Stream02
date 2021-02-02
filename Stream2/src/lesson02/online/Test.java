import java.io.IOException;

public class Test {

    public static void main(String ... str) {
        new Test().a1();
    }

    public void a1() {
        a2();
    }

    public void a2() {
        a3();
    }

    public void a3() {
        try {
            a4(2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a4(int x) throws ClassNotFoundException, IOException {
        if( x%2 ==0){
            throw new ClassNotFoundException();
        }
        else {
            throw new IOException();
        }
    }
}
