package proxy;

public class SimplePojo implements Pojo{
    public void foo(){
        bar();
    }

    public void bar(){
        System.out.println("bar working");
    }
}
