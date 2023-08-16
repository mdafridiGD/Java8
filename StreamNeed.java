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
        StreamNeed streamNeed = new StreamNeed();
        streamNeed.filterList(swimmers);
        streamNeed.multiplyListBy2(swimmers1);
        System.out.println(swimmers2);


        //            With Stream
        List<Integer> streamList = swimmers.stream().filter(a -> a % 2 != 0).map(a -> a * 2).collect(Collectors.toList());
        System.out.println(streamList);

    }


    private void filterList(List<Integer> swimmers) {
        for (int i = 0; i < swimmers.size(); i++) {
            if (swimmers.get(i) % 2 != 0) {
                swimmers1.add(swimmers.get(i));
            }
        }
    }

        private void multiplyListBy2 (List < Integer > swimmers1) {
            for (int i = 0; i < swimmers1.size(); i++) {
                swimmers2.add(swimmers1.get(i) * 2);
            }
        }

    }
