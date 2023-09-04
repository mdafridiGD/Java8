package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNeed {
    static List<Integer> swimmers1 = new ArrayList<>();
    static List<Integer> swimmers2 = new ArrayList<>();
    static List<Integer> swimmers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public static void main(String[] args) {


        //     Stream
        StreamNeed.filterList(swimmers);
        StreamNeed.multiplyListBy2(swimmers1);
        System.out.println(swimmers2);


        //    With Stream
        List<Integer> streamList = swimmers.stream().filter(a -> a % 2 != 0).map(a -> a * 2).collect(Collectors.toList());
        System.out.println(streamList);

    }


    private static void filterList(List<Integer> swimmers) {
        for (int i :swimmers) {
            if (i % 2 != 0) {
                swimmers1.add(i);
            }
        }
    }

        private static void multiplyListBy2 (List < Integer > swimmers1) {
            for (int i :swimmers1) {
                swimmers2.add(i * 2);
            }
        }






    }
