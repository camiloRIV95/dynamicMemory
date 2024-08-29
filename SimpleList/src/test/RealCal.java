package test;

import java.util.List;

import co.edu.uptc.models.aplications.Calculator;

public class RealCal<T> {
    
   
    public void run(List<T> list, String title) {
        Calculator<T> cal = new Calculator<T>(list);
        System.out.println("");
        System.out.println("----------"+ title+"-----");
        int result = 0;
    
        long startTime = System.nanoTime();
    
        cal.sumData();
        result = cal.getResult();
    
        double endTime = System.nanoTime();
        double delayTime = endTime - startTime;
        
        System.out.println("Nano: "+delayTime);
        System.out.println("Mili: "+(delayTime/1_000_000));
        System.out.println("seg: "+(delayTime/1_000_000_000));
        System.out.println("result: "+result);

    }

}
