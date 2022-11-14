import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeetCode {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] arr){
//        int a = arr[0];
//        arr[0] = arr[1];
//        arr[1] = a;

    }

    public static void main1(String[] args) {
        int[] A = {4,5,6};
        int[] B = {1,2,3};
        LeetCode leetCode = new LeetCode();
        leetCode.merge(A,3,B,3);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }

    public void merge(int A[], int m, int B[], int n) {
//        int[] arr = new int[m+n];
//        for (int i = 0; i < A.length; i++) {
//            arr[i] = A[i];
//        }
//        A = arr;
        int[] arr = Arrays.copyOf(A,m+n);
        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i];
        }
        for (int i = m; i < m+n; i++) {
            arr[i] = B[i-m];
        }
        for (int i = 0; i < m+n; i++)
        {
            for (int j = i; j < m+n; j++)
            {
                if (arr[i] > arr[j])
                {
                    int a = 0;
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        A = arr;
        for (int i = 0; i < m+n; i++) {
            A[i] = arr[i];
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        for (int i = 0; i < n.length(); i++) {
            if(i == 0) {
                System.out.print(n.charAt(i));
                continue;
            }
            int count = 0;
            for (int j = 0; j < i; j++) {
                if(n.charAt(j) == n.charAt(i))
                    break;
                if(count == i-1)
                    System.out.print(n.charAt(i));
                count++;
            }
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        if(nums.length <= 1)
            return nums.length;
        for (int i = 0; i < nums.length-count; i++) {
            if (i == nums.length - count - 1) {
                break;
            }
            if(nums[i] == nums[i+1]){
                for (int j = i; j < nums.length-count; j++) {
                    if (j == nums.length - 1) {
                        nums[j] = 0;
                        continue;
                    }
                    nums[j] = nums[j + 1];
                }
                i--;
                count++;
            }
        }
        return nums.length-count;
    }
    //26. 删除有序数组中的重复项
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length-count; i++) {
            if(nums[i] == val){
                for (int j = i; j < nums.length-count; j++) {
                    if (j == nums.length - 1) {
                        nums[j] = 0;
                        continue;
                    }
                    nums[j] = nums[j + 1];
                }
                count++;
                i--;
            }
        }
        return nums.length-count;
    }
    //27. 移除元素
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> L1 = new ArrayList<>(numRows);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l1.add(1);
        l.add(1);
        L1.add(l);
        if(numRows >= 2) {
            l1.add(1);
            L1.add(l1);
        }
        for (int i = 3; i <= numRows; i++) {
            List<Integer> li = new ArrayList<>();
            li.add(1);
            li.add(1);
            for (int j = 1; j < i-1; j++) {
                li.add(j,l1.get(j-1) + l1.get(j));
            }
            L1.add(li);
            l1 = li;
        }
        return L1;
    }
    //118. 杨辉三角
    public String addStrings(String num1, String num2) {
        int x = num1.length()-1;
        int y = num2.length()-1;
        int count = 0;
        StringBuilder str = new StringBuilder();
        while(x >= 0 || y >= 0) {
            int tmp= 0;
            if(x < 0)
                tmp = Integer.valueOf(String.valueOf(num2.charAt(y)))+count;
            else if (y < 0)
                tmp = Integer.valueOf(String.valueOf(num1.charAt(x)))+count;
            else
                tmp = Integer.valueOf(String.valueOf(num1.charAt(x)))+Integer.valueOf(String.valueOf(num2.charAt(y)))+count;
            if(tmp >= 10){
                count = 1;
                str.insert(0,String.valueOf(tmp%10));
                x--;
                y--;
            }else {
                count = 0;
                str.insert(0,String.valueOf(tmp));
                x--;
                y--;
            }
        }
//        if(num1.length()>num2.length()) {
//            if (count == 1) {
//                str.insert(0, String.valueOf(1 + Integer.valueOf(String.valueOf(num1.charAt(x)))));
//            } else
//                str.insert(0,String.valueOf(num1.charAt(x)));
//            for (int i = x-1 ; i >= 0; i--) {
//                str.insert(0,String.valueOf(num1.charAt(i)));
//            }
//        }
//        if (num1.length()<num2.length()){
//            if (count == 1) {
//                str.insert(0, String.valueOf(1 + Integer.valueOf(String.valueOf(num2.charAt(y)))));
//            } else
//                str.insert(0,String.valueOf(num2.charAt(y)));
//            for (int i = y-1 ; i >= 0; i--) {
//                str.insert(0,String.valueOf(num2.charAt(i)));
//            }
//        }

        if (count == 1)
            str.insert(0,"1");

//        StringBuilder stringBuilder = new StringBuilder(str);
//        stringBuilder.reverse();
        String s1 = str.toString();
        return s1;
    }
    //415. 字符串相加
}


