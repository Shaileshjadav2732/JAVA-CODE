public class array {
    public static void main(String[] args){
        int i;
       // int [] marks = new int[100];// memory Allocation
       int []marks={77,776,55,44,33,23,412,345,};
       /* int marks;
        marks=new int [100];*/

        for (i=0;i<=99;i++){
            marks[i]=i+1;

    }
        for (i=0;i<=marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Array Length is "+marks.length);
    }

   /* for (int element:marks){
        System.out.println(element);*/
    }
 
