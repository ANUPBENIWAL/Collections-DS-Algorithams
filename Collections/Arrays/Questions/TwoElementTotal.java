package Questions;
public class TwoElementTotal {
    public static void main(String[] args) {
        int values=8;

        int index1 = -1, index2 = -1;
        int a[] = {1,3,5,7};
        for(int i =0; i< a.length;i++){
            for (int j=i+1; j<a.length;j++){
                if(a[i]+a[j] == values){
                   index1 = i;
                   index2 = j;
                }   
            }
        }
        System.out.println(index1);
        System.out.println(index2);
    }
}
