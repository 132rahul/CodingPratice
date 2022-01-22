package HakerErth;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MagicalTube {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] query = new int[Q][2];
        for (int i_query = 0; i_query < Q; i_query++) {
            String[] arr_query = br.readLine().split(" ");
            for (int j_query = 0; j_query < arr_query.length; j_query++) {
                query[i_query][j_query] = Integer.parseInt(arr_query[j_query]);
            }
        }

        int[] out_ = elements(Q, query);
        System.out.print(out_[0]);
        for (int i_out_ = 1; i_out_ < out_.length; i_out_++) {
            System.out.print(" " + out_[i_out_]);
        }

        wr.close();
        br.close();
    }

    static int[] elements(int Q, int[][] query) {
        List<Integer> list = new ArrayList<Integer>();
        int[] result = {0};
        int[] result1 = new int[Q];

        for (int i_query = 0; i_query < Q; i_query++) {
            if (query[i_query][0] == 1) {
                list.add(query[i_query][1]);
                // result1[i_query]=query[i_query][1];
            } else if (query[i_query][0] == 2) {
                removelast(list);
            }
        }
        System.out.println(list);
        // int[] result = {0};
        return result1;
    }

    private static int removelast(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

        for (Map.Entry et : map.entrySet()) {
            max = Math.max((Integer) et.getValue(), max);
        }
        System.out.println(max);

        System.out.println(map);
        return 0;
    }
}