import java.util.*;
import java.io.*;
public class MyHeap {
  public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(HeapPrinter.toString(data));
    heapify(data);
    System.out.println(HeapPrinter.toString(data));
  }
  private static void pushDown(int[] data, int size, int index) {

  }
  private static void pushUp(int[] data, int index) {

  }
  public static void heapify(int[] data) {
    int start = (data.length - 2)/2;
   for (int i = start; i >= 0; i--) {
     pushDown(data, data.length - 1, i);
    }
  }
  public static void heapsort(int[] data) {

  }
  private static boolean hasChildL(int size, int idx) {
    return 2 * idx + 1 <= size;
  }
  private static boolean hasChildR(int size, int idx) {
    return 2 * idx + 2 <= size;
  }
  private static int getChildL(int size, int idx) {
    return 2 * idx + 1;
  }
  private static int getChildR(int size, int idx) {
    return 2 * idx + 2;
  }
  private static void swap(int i1, int i2, int[] data) {
    int temp = data[i1];
    data[i1] = data[i2];
    data[i2] = temp;
  }
}
