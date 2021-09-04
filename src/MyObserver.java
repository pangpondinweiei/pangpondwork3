public class MyObserver {
    public void update(Source o) {
        System.out.println(
                "live result: "
                        +o.getData());
    }
}
