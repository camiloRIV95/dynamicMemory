package test;
import java.util.List;

import co.edu.uptc.models.aplications.Calculator;
import co.edu.uptc.utils.dynamic.SimpleListV2;

public class DemoSimpleList {

    private List<Integer> list;
 public  void testArrayList() {
    loadDataArrayList();
    
  };

  public  void loadDataArrayList() {
    
   list = new SimpleListV2<Integer>();
    for (int i = 0; i < 300000; i++) {
      list.add(i);
    }
  }


  public List<Integer> getList(){
    return list;
  }

    
}
