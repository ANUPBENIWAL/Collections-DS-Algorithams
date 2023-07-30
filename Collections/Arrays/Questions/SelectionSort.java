package Questions;

public class SelectionSort {
    int a[] = {38,52,9,6,53};
    int b;
    int temp=0;
    for (int i = 0;i<a.length;i++){
        b=i;
        for(int j=i+1;j<a.length;j++){
            if(a[i]<a[b]){
                b=j;
            }
        }
        temp=a[i];
        a[i]=a[b];
        a[b]=temp;
        System.out.println(temp);
        System.out.println(a[b]+a[i]);
    }
    
}
