package nullPointer;

import java.util.List;

public class NullTest4 {

    private void unsafe(List<String> myList) {
        for (String str: myList) {
            System.out.println("5");
        }
    }
}
