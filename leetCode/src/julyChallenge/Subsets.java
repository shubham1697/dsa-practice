package julyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {
    static Set<String> set = new HashSet<>();
    public static void main(String[] args){
//        int[] nums = {1,2,3};
//        subSets(nums);
        String str = "123";
        subSets(str, "");
        System.out.println(set);
    }

    private static void subSets(String str, String ans) {
        if(str.length() == 0) {
            set.add(ans);
            return ;
        }

        char ch= str.charAt(0);
        set.add(ch + "");
        String ros = str.substring(1);
        subSets(ros, ans + ch);
        subSets(ros, ans);

    }
}
