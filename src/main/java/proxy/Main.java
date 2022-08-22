package proxy;

public class Main {
    public static void main(String[] args) {
        SimplePojo pojo = new ProxyPojo();
        pojo.foo();
        System.out.println("-------------------------");
        pojo.bar();
    }


}
