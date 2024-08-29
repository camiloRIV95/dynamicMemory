package co.edu.uptc.utils.systemInfo;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;


public class SystemMemoryInfo {
     public void run() {
        // Obtener el bean del sistema operativo
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

        // Obtener la memoria total del sistema (en bytes)
        long totalMemorySize = osBean.getTotalPhysicalMemorySize();
        System.out.println(totalMemorySize);
 // Obtener la memoria disponible del sistema (en bytes)
 long freeMemorySize = osBean.getFreePhysicalMemorySize();

 // Convertir bytes a megabytes
 long totalMemoryInMB = totalMemorySize / (1024 * 1024);
 long freeMemoryInMB = freeMemorySize / (1024 * 1024);

 System.out.println("Total Memory: " + totalMemoryInMB + " MB");
 System.out.println("Free Memory: " + freeMemoryInMB + " MB");
 System.out.println("--------");
    }
}
