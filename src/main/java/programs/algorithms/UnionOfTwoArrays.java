package programs.algorithms;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

    public static void main(String[] args) {
        int [] arr = {1,3,4,1,2};
        int [] arr2 = {3,5,6,8};
        Set st1 = new HashSet<>();
        Set st2 = new HashSet<>();


        for(int i : arr)
        {
            st1.add(i);
        }

        for(int i : arr2)
        {
            st2.add(i);
        }

        st1.addAll(st2);

        System.out.println(st1);
    }
}
