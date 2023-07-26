package Questions;

public class Selection {
    public static void main(String[] args) {
         int a[]={17,10,8,11,2};
            // {1,10,8,11,2};
             for(int i = 0 ; i < a.length; i++){
               for(int j = i+1; j < a.length; j++){
                 if(a[i] > a[j]){
                   int a1 = a[j];
                   a[j] = a[i];
                   a[i] = a1;
                 }
               }System.out.println(a[i]); 
             }
            
    }
}
