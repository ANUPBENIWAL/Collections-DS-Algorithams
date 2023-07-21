public class main{

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1); 
        list.add(2); 
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); 

        list.remove(2);
        
        
       System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        

    }


}