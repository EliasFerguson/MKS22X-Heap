import java.util.*;
import java.io.*;
public class MyHeap {
  public static void main(String[] args) {
    /*System.out.println("Size\t\tMax Value\theap/builtin ratio ");
    int[]MAX_LIST = {1000000000,500,10};
    for(int MAX : MAX_LIST){
      for(int size = 31250; size < 2000001; size*=2){
        long htime=0;
        long btime=0;
        //average of 5 sorts.
        for(int trial = 0 ; trial <=5; trial++) {
          int []data1 = new int[size];
          int []data2 = new int[size];
          for(int i = 0; i < data1.length; i++){
            data1[i] = (int)(Math.random()*MAX);
            data2[i] = data1[i];
          }
          long t1,t2;
          t1 = System.currentTimeMillis();
          MyHeap.heapsort(data2);
          t2 = System.currentTimeMillis();
          htime += t2 - t1;
          t1 = System.currentTimeMillis();
          Arrays.sort(data1);
          t2 = System.currentTimeMillis();
          btime+= t2 - t1;
          if(!Arrays.equals(data1,data2)){
            System.out.println("FAIL TO SORT!");
            System.exit(0);
          }
        }
        System.out.println(size +"\t\t"+MAX+"\t"+1.0*htime/btime);
      }
      System.out.println();
    }*/
    int[] data = {-12, 100, 23142, -2, 4, 1213, -4, 0, 21, 4, 51, -8};
    System.out.println(Arrays.toString(data));
    heapsort(data);
    System.out.println(Arrays.toString(data));
  }
  private static void pushDown(int[] data, int size, int index) {
    boolean done = false;
    while (!done) {
      if (!hasChildL(size, index)) done = true;
      else if(!hasChildR(size, index)) {
        if (data[getChildL(index)] > data[index]) {
          swap(index, getChildL(index), data);
        }
        else done = true;
      }
      else {
        int leftI = getChildL(index);
        int rightI = getChildR(index);
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
    boolean done = false;
    while (!done) {
      if (index == 0) done = true;
      else {
        int parentI = getParent(index);
        if (data[parentI] < data[index]) {
          swap(parentI, index, data);
          index = parentI;
        }
        else done = true;
      }
    }
  }
  public static void heapify(int[] data) {
   for (int i = data.length - 1; i > -1; i--) {
     pushDown(data, data.length, i);
    }
  }
  public static void heapsort(int[] data) {
    heapify(data);
    System.out.println(HeapPrinter.toString(data));
    int size = data.length - 1;
    while (size > 0) {
      swap(0, size, data);
      pushDown(data, size, 0);
      size--;
    }
  }
  private static boolean hasChildL(int size, int idx) {
    return 2 * idx + 1 < size;
  }
  private static boolean hasChildR(int size, int idx) {
    return 2 * idx + 2 < size;
  }
  private static int getChildL(int idx) {
    return 2 * idx + 1;
  }
  private static int getChildR(int idx) {
    return 2 * idx + 2;
  }
  private static int getParent(int idx) {
    return (idx - 1) / 2;
  }
  private static void swap(int i1, int i2, int[] data) {
    int temp = data[i1];
    data[i1] = data[i2];
    data[i2] = temp;
  }
}
