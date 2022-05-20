package main;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEnv {

    public static void initiate(List<Integer> listA, LinkedList<Integer> listB, boolean reverseOrder){
        
        int a;
        int b;
        
        if (reverseOrder){
            a = getIntFromList(reverseLinkedList(listA));
            b = getIntFromList(reverseLinkedList(listB));
            LinkedList<Integer> revSumList = reverseLinkedList(getListFromInt(getSum(a, b)));
            System.out.println(revSumList);
        }
        else {
            a = getIntFromList(listA);
            b = getIntFromList(listB);
            LinkedList<Integer> forSumList = getListFromInt(getSum(a, b));
            System.out.println(forSumList);
        }

        
    }

    public static LinkedList<Integer> reverseLinkedList(List<Integer> linkList) {
        Collections.reverse(linkList);
        return (LinkedList<Integer>) linkList;
    }

    public static int getIntFromList(List<Integer> linkList) {
        int resultInt = Integer.parseInt(linkList.stream().map(Object::toString).collect(Collectors.joining("")));
        return resultInt;
    }

    public static LinkedList<Integer> getListFromInt(int sumInt){
        String str = String.valueOf(sumInt);
        LinkedList<Integer> resultList = new LinkedList<Integer>();

        for(String s : Arrays.asList(str.split(""))){
            resultList.add(Integer.valueOf(s));
        }
        return resultList;
    }

    public static int getSum(int aInt, int bInt) {
        int sum = aInt + bInt;
        return sum;
    }

    public static void main(String[] args) {

        // LISTS ARE IN FORWARD ORDER BY DEFAULT
        LinkedList<Integer> A = new LinkedList<Integer>(Arrays.asList(6, 1, 7));
        LinkedList<Integer> B = new LinkedList<Integer>(Arrays.asList(2, 9, 5));

        // FORWARD ORDER
        initiate(A, B, false);

        // REVERSE ORDER
        initiate(reverseLinkedList(A), reverseLinkedList(B), true);

    }

}

