package util;

import java.util.Arrays;
import java.util.List;

/**
" * @author miact
" */
public class DemoTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Object[] objects = list.toArray();
        System.out.println(objects.getClass().getSimpleName());

        objects[0] = new Object();
    }
}
