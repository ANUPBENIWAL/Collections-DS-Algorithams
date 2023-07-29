package Questions;

public class LargestNumber {
    public static void main(String[] args) {
        int a[] = {2,4,1,5};
        int largest =a[0];
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest = a[i];
            }
        }System.out.println(largest);
    }
}
