public class MyArrayList {
  private int[] list;
  private int pointer = 0;

  public MyArrayList() {
    list = new int[10];
  }

  public void add(int value) {
    if (pointer == list.length) {
      int[] newList = new int[list.length * 2];
      System.arraycopy(list, 0, newList, 0, list.length);
      list = newList;
    }
    list[pointer] = value;
    pointer++;
  }

  public void remove(int value) {
    if (contains(value)) {
      int ind = getIndex(value);// 3
      for (int i = ind; i < size(); i++) { // 6
        list[ind] = list[ind + 1];
        ind++;
      }
      pointer--;
    }
  }

  public void insertAt(int value, int index){

    for(int i = index; i < size() + 1; i++){ 
       int next = list[i]; 
       list[i] = value;
       value = next; 
    }
    pointer++;

  }

  public int getIndex(int value) {
    for (int i = 0; i < list.length; i++) {
      if (value == list[i]) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(int value) {
    for (int i : list) {
      if (value == i) {
        return true;
      }
    }
    return false;
  }

  public int size() {
    return pointer;
  }

  public int get(int index) {
    if (index < list.length) {
      return list[index];
    }
    return -1;
  }

  // insertAt
   
}