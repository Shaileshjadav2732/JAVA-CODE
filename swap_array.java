@SuppressWarnings("ReassignedVariable")
public class swap_array {
    public static void main(String[] args){
        int i;
        int []number={78,56,87,90,56,90,89,65};

        //int n=math.floorDiv(number.length,2); also use as (number.length-1)/2
        for(i=0;i<=(number.length-1)/2;i++){

            int temp;
            temp=number[i];
            number[i]=number[number.length-1-i];
            number[number.length-1-i]=temp;

        }
        for( int element:number){
            System.out.print(element+" ");
        }
        System.out.println();

        int k;
        k = Integer.MIN_VALUE;
        System.out.println(k);
        int l=Integer.MAX_VALUE;
        System.out.println(l);


        boolean issorted=false;
        int[] arr={12,34,45,56,67,78,89};
        for(i=0;i<=arr.length-2;i++){
            if(arr[i]<arr[i+1]){
               issorted=true;
               break;
            }
        }
            if(issorted){
                System.out.println("Array is sorted");
            }
            else{
                System.out.println("Array is not sorted");
            }




    }
}
