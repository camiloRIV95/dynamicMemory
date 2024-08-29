package test;
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {


    private List<Integer> list;
 public  void testArrayList() {
    loadDataArrayList();

  };

  public  void loadDataArrayList() {
    
   list = new ArrayList<Integer>();
    for (int i = 0; i < 300000; i++) {
      list.add(i);
    }
  }
 public List<Integer> getList(){
    return list;
 }
    
}
