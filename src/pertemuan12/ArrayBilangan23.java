package pertemuan12;

import java.util.Arrays;

public class ArrayBilangan23 {
    public static void main(String[] args) {
     int bil [] =  {23, 31, -3, 22};
     for (int i = 0; i < bil.length; i++) {
    System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
            
        }
        System.out.println(Arrays.toString(bil));
    }

}
