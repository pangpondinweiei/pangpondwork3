import java.util.Scanner;

public class TestObserver {
    public static void main(String[] args) {
        Source obj = new Source();
        MyObserver myObserver1 = new MyObserver();
        MyObserver myObserver2 = new MyObserver();
        obj.register(myObserver1);
        obj.register(myObserver2);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score : ");
            String i = sc.nextLine();
            if (i.equals("")){
                break;
            }
            obj.setData(i);

        }

    }
}
