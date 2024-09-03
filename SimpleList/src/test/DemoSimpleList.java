package test;
import java.util.List;
import java.util.LinkedList;

public class DemoSimpleList {
    private List<Integer> list;

    public DemoSimpleList() {
        this.list = new LinkedList<>();
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    public void testArrayList() {
    }
}
