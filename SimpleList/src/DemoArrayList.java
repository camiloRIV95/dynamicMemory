import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    private List<Integer> list;
 public  void testArrayList() {
    loadDataArrayList();
    sumDataArrayList();
  };

  public  void loadDataArrayList() {
    
   list = new ArrayList<Integer>();
    for (int i = 0; i < 100000; i++) {
      list.add(i);
    }
  }

  public  void sumDataArrayList() {
    int result = 0;
    System.out.println("");
    System.out.println("----------array List-----");
    long startTime = System.nanoTime();
    for (int i = 0; i < list.size(); i++) {
      result = result + list.get(i);
    }
    double endTime = System.nanoTime();
    double delayTime = endTime - startTime;
    
    System.out.println("Nano: "+delayTime);
    System.out.println("Mili: "+(delayTime/1_000_000));
    System.out.println("seg: "+(delayTime/1_000_000_000));
    System.out.println("result: "+result);
  }
 
    
}
