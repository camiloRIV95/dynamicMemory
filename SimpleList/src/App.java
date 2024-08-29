import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.aplications.Calculator;
import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;

public class App {

 
  public static void main(String[] args) throws Exception {

    
    DemoArrayList da = new DemoArrayList();
    da.testArrayList();
    RealCal<Integer> ra = new RealCal<>();
    ra.run(da.getList(),"ArrayLIst");
    
    
    
     DemoSimpleList ds = new DemoSimpleList();
     ds.testArrayList();
     ra.run(ds.getList(),"simpleLIst");
    
 

    
  




  }

  
}
