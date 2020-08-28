package Fifth;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Random;

public class rhkwp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Random rand = new Random();
        final int MAX = 10;
        final int RANGE = 100;
        int sum = 0;
        int cnt = 0;
        int[] arr = new int[MAX];
        for(int i = 0; i < MAX; i++) {
            arr[i] = rand.nextInt(RANGE);
        }
        for(Integer value: arr) {
            cnt++;
            sum+= sum+value;
            System.out.println(sum);

            for (int i = 0; i < MAX; i++) {
                list.get(i);
                System.out.println(list);

            }



        }

    }
}
