package HakerErth;

import java.util.Scanner;

public class CoinCollector {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] ary = new int[]{3, 2, 1};
      /*  for (int i = 0; i < n; i++) {
            ary[i]=sc.nextInt();
        }*/
        System.out.println(FindTotalcoin(ary));
    }

    private static long FindTotalcoin(int[] ary) {
        long result = 0;
       /*while (i != ary.length) {
            if (ary[i] == 0) {
                return result;
            }
            while (i < ary.length) {
                if (ary[i] == 0) {
                    return result;
                } else {
                    int a = i;
                    i = ((i % ary.length) + 1);
                    ++result;
                    ary[a] = ary[a] - 1;
                }
            }
            i = 0;
        }*/
        long index=0;
        long min=Integer.MAX_VALUE;
        for(int i=0;i< ary.length;i++){
            if(min>ary[i]){
                min=ary[i];
                index=i;
            }
        }
        result=min* ary.length+(index-0);
        return result;
    }
}
