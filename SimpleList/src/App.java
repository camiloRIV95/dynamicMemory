import co.edu.uptc.models.dynamic.SimpleList;
import co.edu.uptc.models.dynamic.SimpleListV2;
import co.edu.uptc.models.staticModel.VectorOnly;
import co.edu.uptc.models.systemInfo.SystemMemoryInfo;


public class App {
    public static void main(String[] args) throws Exception {

         
      
        testmemory();
        testDynamic();
        testStaticModel();
    }


    public static void testDynamic(){
        long startTime = System.nanoTime();
        
        
        SimpleListV2 sl = new SimpleListV2();
        for (int i = 0; i < 407_000_000; i++) {
            sl.add(i);            
        }
        
         
        //sl.showList();

        long endTime = System.nanoTime();


        long durationNano = endTime-startTime;
        System.out.println();
        System.out.println("---- dynamic");
      System.out.println("Duration time: "+durationNano+" NanoSecond");
      System.out.println("Duration time: "+(durationNano/1_000_000.0) + "  MilliSecond");
      System.out.println("Duration time: "+(durationNano/ 1_000_000_000.0) + "  Seconds");


    }

public static void testStaticModel(){
    VectorOnly vo = new VectorOnly();
    vo.fullData();
}

public static void testmemory() {
    long heapSize = Runtime.getRuntime().totalMemory();
    long heapMaxSize = Runtime.getRuntime().maxMemory();
    long heapFreeSize = Runtime.getRuntime().freeMemory();

    System.out.println("Heap Size: " + heapSize / (1024 * 1024) + " MB");
    System.out.println("Max Heap Size: " + heapMaxSize / (1024 * 1024) + " MB");
    System.out.println("Free Heap Size: " + heapFreeSize / (1024 * 1024) + " MB");
}

}
