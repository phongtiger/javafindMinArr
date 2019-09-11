import java.util.Scanner;

public class findMinArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findMin min = new findMin();

        System.out.println("Nhap vao so phan tu cua mang <20");
        int length = scanner.nextInt();
        try{
            min.check20(length);
            int[] arr = min.creatArr(length);
            int minAr = min.findMinArr1(arr);
            System.out.println("\n Min arr "+ minAr);
        } catch (Exception e) {
            System.out.println("hello error");

        }
    }
}

class findMin {
    public int findMinArr1(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(min>a[i]){min = a[i];}
        }
        return min;
    }
    public  int[] creatArr(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " +(i+1)+" :");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public void check20(int a) throws Exception {
        if (a < 0) {
            throw new Exception();
        } else if (a > 20) {
            throw new Exception();
        } else{
            System.out.println("continue");
        }
    }
}
