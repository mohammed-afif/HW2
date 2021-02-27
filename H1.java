import java.util.Arrays;
import java.io.*;
import java.util.*;
public class H1 {
        int arr[] = {2, 7, 2, 5, 3};
        public void printRepeating(int arr[]) {
            int i, j;
            for (i = 0; i < arr.length; i++) {
                for (j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        System.out.print(arr[i] + " ");
                }
            }}
        public static void main(String[] args) {
            H1 r = new H1();
            r.printRepeating(r.arr);
        }
    }
