import java.util.Arrays;
import java.util.Scanner;

public class Test {

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
        Test test = new Test();
        test.merge(A,3,B,3);
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




