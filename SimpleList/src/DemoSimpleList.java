import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.dynamic.SimpleList;
import co.edu.uptc.models.dynamic.SimpleListV2;

public class DemoSimpleList {

    private List<Integer> list;
 public  void testArrayList() {
    loadDataArrayList();
    sumDataArrayList();
  };

  public  void loadDataArrayList() {
    
   list = new SimpleListV2<Integer>();
    for (int i = 0; i < 100000; i++) {
      list.add(i);
    }
  }

  public  void sumDataArrayList() {
    System.out.println("");
    System.out.println("----------Simple List-----");
    int result = 0;
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
