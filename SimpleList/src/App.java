import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.aplications.Calculator;
import java.util.ArrayList;
import java.util.List;

import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;

public class App {
    public static void main(String[] args) throws Exception {
        DemoArrayList da = new DemoArrayList();
        da.testArrayList();
        DemoSimpleList ds = new DemoSimpleList();
        ds.setList(new ArrayList<>(da.getList())); 

        RealCal<Integer> ra = new RealCal<>();
        ra.run(da.getList(), "ArrayList");
        ra.run(ds.getList(), "SimpleList");
    }
}
