public class MyHeap {
  public static void main(String[] args) {

  }
  private static void pushDown(int[] data, int size, int index) {
    boolean done = false;
    while (!done) {

    }
  }
  private static void pushUp(int[] data, int index) {

  }
  public static void heapify(int[] data) {

  }
  public static void heapsort(int[] data) {

  }
  private static int[] getChildren(int index, int[] data, int size) {
    int[] children = new int[2];
    int retIndex = (2 * index) + 2;
    if (retIndex < size) {
      children[0] = data[retIndex - 1];
      children[1] = data[retIndex];
    }
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
