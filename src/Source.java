import java.util.ArrayList;

public class Source {
    private final ArrayList<MyObserver> list = new ArrayList<MyObserver>();
    private String Data;

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
        notifyObservers();
    }

    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
        }
    }
        public void register (MyObserver observer){
            list.add(observer);
        }
}
