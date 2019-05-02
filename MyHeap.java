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
    boolean done = false;
    while (!done) {
      if (!hasChildL(size, index)) done = true;
      else if(!hasChildR(size, index)) {
        if (data[getChildL(size, index)] > data[index]) {
          swap(index, getChildL(size, index), data);
        }
        else done = true;
      }
      else {
        int leftI = getChildL(size, index);
        int rightI = getChildR(size, index);
        int max = Math.max(data[leftI], data[rightI]);
        if (data[index] >= max) done = true;
        else if (max == data[leftI]) {
          swap(index, leftI, data);
          index = leftI;
        }
        else {
          swap(index, rightI, data);
          index = rightI;
        }
      }
    }
  }
  private static void pushUp(int[] data, int index) {

  }
  public static void heapify(int[] data) {
   for (int i = data.length - 1; i >= 0; i--) {
     pushDown(data, data.length, i);
    }
  }
  public static void heapsort(int[] data) {

  }
  private static boolean hasChildL(int size, int idx) {
    return 2 * idx + 1 < size;
  }
  private static boolean hasChildR(int size, int idx) {
    return 2 * idx + 2 < size;
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
