package arrays;

/**
 * Created by aw186034 on 6/24/17.
 */
public class MedianOfTwoArrays {

    public double median(int[] a1, int[] a2) {
        int starta1 = 0;
        int enda1 = a1.length - 1;

        int starta2 = 0;
        int enda2 = a2.length - 1;

        while (enda1 != starta1) {
            int mida1 = (enda1 + starta1) / 2;
            int mida2 = (enda2 + starta2) / 2;

            if (a1[mida1] == a2[mida2]) return a1[mida1];
            if (a1[mida1] > a2[mida2]) {
                enda1 = mida1 + 1;
                starta2 = mida2 - 1;
            } else {
                starta1 = mida1 - 1;
                enda2 = mida2 + 1;
            }
        }

        return (a1[starta1] + a2[starta2]) / 2;
    }

    double median(int[] a) {
        if (a.length % 2 == 0) {
            return (a[a.length / 2] + a[a.length / 2 + 1]) / 2.0;
        }
        return a[a.length / 2];
    }
}