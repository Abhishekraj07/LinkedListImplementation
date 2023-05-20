package org.example;

import java.util.*;

public class Main {

    static Boolean checkValidParanthesis(String param){
        boolean returnVal = false;
        Map<Character,Character>map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        int len = param.length();

        Stack<Character> charStack = new Stack<>();
        if(len==0){
            return true;
        }
        for(int i=0;i<len;i++){
            if(charStack.isEmpty()){
                charStack.push(param.charAt(i));
            }
            else if(map.containsKey(param.charAt(i))){
               if( map.get(charStack.peek())==param.charAt(i)){
                   charStack.pop();
               }else{
                   charStack.push(param.charAt(i));
               }
            }
        }

        if(charStack.isEmpty()){
            return true;
        }

        return returnVal;
    }

    static Boolean assertEquals(List<Boolean> test){
        List<Boolean> expectedRes = Arrays.asList(true, true, false, false, true, true, true);
        for(int i=0; i<expectedRes.size(); i++){
            if(test.get(i)!=expectedRes.get(i)) return false;
        }
        return true;
    }

    static List<Boolean> solve(List<String> param){
        List<Boolean> booleanList = new ArrayList<>();
        param.forEach(a -> booleanList.add(checkValidParanthesis(a)));
        return booleanList;
    }
    public static void main(String[] args) {

        List<String> param = Arrays.asList("[]", "()", "(]", "((((]))))", "()(){[()]}", "(1)" , "(()()()()[]{})");

        List<Boolean> solvedRes = solve(param);

        Boolean solvedCorrectly = assertEquals(solvedRes);
        if (solvedCorrectly){
            System.out.println("solved correctly");
        }else {
            System.out.println("solved Incorrectly ");
        }
//
//
//
//
//        //find the even number from a array
//        Integer arr[]={2,3,44,67,202};
//        Arrays.stream(arr).filter(p->p%2==0).forEach(System.out::println);
//
//        //approch without using stream
//        int count=0;
//        Integer length = arr.length;
//        for(int i=0;i<length;i++){
//            if(arr[i]%2==0){
//                count++;
//            }
//        }
//        int idx =0;
//        Integer arr2[] = new Integer[count];
//        for(int i=0;i<length;i++){
//            if(arr[i]%2==0){
//                arr2[idx]=arr[i];
//                idx++;
//            }
//        }
//        Arrays.stream(arr2).forEach(System.out::println);
//
//
//        ///how to reverse an array
//        System.out.println("_____________");
//
//        //Collections.reverse(Arrays.asList(arr));
//        Arrays.stream(arr).forEach(System.out::println);
//
//        //approch without using methods
//        System.out.println("_____________");
//
//        int i = 0;
//        int j = arr.length-1;
//        while(i<j){
//            int temp =arr[i];
//            arr[i]=arr[j];
//            arr[j]= temp;
//            i++;
//            j--;
//        }
//
//        System.out.println("_____________");
//
//        System.out.println(Arrays.asList(arr));
//
//        ///how to find the minimum value in array ----
//        int min =arr[0];
//        for(int k =0;i<length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("-------------");
//        System.out.println(min);
//
//        /// move all zeros to end of an array
//
//        Integer []arr3 ={2,0,3,0,7};//2,3,7,0,0
//        int l=0;
//        for(int k =0;k<arr3.length;k++){
//            if(arr3[k]!=0 && arr[l]==0){
//                int temp=arr3[k];
//                arr3[k]=arr3[l];
//                arr3[l]=temp;
//
//            }
//            if(arr[l]!=0){
//                l++;
//            }
//
//        }
//
//
//        System.out.println("-----");
//        System.out.println(Arrays.asList(arr3));
//
//
    }
}