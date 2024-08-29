package co.edu.uptc.utils.staticModel;

public class VectorOnly {
    

    public void fullData(){
        long startTime = System.nanoTime();
        int data[] = new int[2_000_000_000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        long endTime = System.nanoTime();


        long durationNano = endTime-startTime;
        System.out.println();
        System.out.println("---- static");
      System.out.println("Duration time: "+durationNano+" NanoSecond");
      System.out.println("Duration time: "+(durationNano/1_000_000.0) + "  MilliSecond");
      System.out.println("Duration time: "+(durationNano/ 1_000_000_000.0) + "  Seconds");
      

    }

}
