import java.util.*;
import java.io.*;
public class MyHeap {
  public static void main(String[] args) {

  }
  private static void pushDown(int[] data, int size, int index) {
    boolean done = false;
    int[] kids;
    while (!done) {
      if (children(index, data, size)) {
        kids = getChildren(index, data);
        if (kids[0] >= kids[1] && kids[0] > data[index]) {
          swap(index,  ((index * 2) + 1),data);
        }
        else if (kids[1] > kids[0] && kids[1] > data[index]) {
          swap(index,  ((index * 2) + 2),data);
        }
        else done = true;
      }
      else done = true;
    }
  }
  private static void pushUp(int[] data, int index) {

  }
  public static void heapify(int[] data) {

  }
  public static void heapsort(int[] data) {

  }
  private static boolean children(int index, int[] data, int size) {
    int test = (2 * index) + 2;
    if (test < size) return true;
    return false;
  }
  private static int[] getChildren(int index, int[] data) {
    int[] children = new int[2];
    int retIndex = (2 * index) + 2;
    children[0] = data[retIndex - 1];
    children[1] = data[retIndex];
    return children;
  }
  private static int getParent(int index, int[] data) {
    int retIndex = (index - 1) / 2;
    return data[retIndex];
  }
  private static void swap(int i1, int i2, int[] data) {
    int temp = data[i1];
    data[i1] = data[i2];
    data[i2] = temp;
  }
}
