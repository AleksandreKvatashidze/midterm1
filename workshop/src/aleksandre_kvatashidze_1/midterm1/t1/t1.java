package aleksandre_kvatashidze_1.midterm1.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * this program takes in two lists and creates a third one by ordering the second one based on the order of the first list
 */


public class t1 {
    public static void main(String[] args) {
        // order of the strings for third list
        int[] list1 = {9,4,10,2,8,3,6,1,7,5};
        // strings that needs to be ordered
        String[] list2 = {"hns","gkr","cbd","vxo","zyj","aog","yzl","qly","xyr","yqf","irk","hwz"};
        // third list
        List<String> list3 = new ArrayList<>();
        // loop that goes through the values of list1 and adds in list3 the list2 strings
        for (int i = 0; i < list1.length; i++) {
            list3.add(list2[list1[i]-1]);
        }
        System.out.println(list3);

    }

}
