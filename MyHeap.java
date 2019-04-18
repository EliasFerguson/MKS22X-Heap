public class MyHeap {
  public static void main(String[] args) {

  }
  private static void pushDown(int[] data, int size, int index) {

  }
  private static void pushIp(int[] data, int index) {

  }
  public static void heapify(int[] data) {

  }
  public static void heapsort(int[] data) {

  }
  private int[] getChildren(int index, int[] data) {
    int[] children = new int[2];
    int retIndex = (2 * index) + 2;
    if (retIndex < data.length) {
      children[0] = data[retIndex - 1];
      children[1] = data[retIndex];
    }
    return children;
  }
  private int getParent(int index, int[] data) {
    int retIndex = (index - 1) / 2;
    return data[retIndex];
  }
}
