import java.util.ArrayList;
import java.util.List;

public class Predict {

    public static void main(String[] args) {

        int arr[] = {1, 6, 8, 6, 2, 0, 9, 7, 1, 4, 5, 8, 3, 6, 2, 12, 5, 4, 8,22,36,44};

        List<Integer> list=new ArrayList<>();

        for (int w:arr) {
            if(w%2==0 && !list.contains(w)) {
                list.add(w);
            }
        }
        System.out.println(list);

    }
}
