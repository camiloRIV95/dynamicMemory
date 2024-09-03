package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoArrayList {
    private List<Integer> list;

    public DemoArrayList() {
        this.list = new ArrayList<>();
    }

    public void generateRandomNumbers(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(10000) + 1;
            list.add(randomNumber);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void testArrayList() {
        generateRandomNumbers(100); 
    }
}
