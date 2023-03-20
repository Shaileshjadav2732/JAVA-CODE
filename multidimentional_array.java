
public class multidimentional_array {
    public static void main(String[] args){
        int i,j;
        int []marks;// 1-D array
        int [][] flats;//2-D array
        flats= new int [2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;

        flats[1][0]=200;
        flats[1][1]=201;
        flats[1][2]=202;


        for(i=0;i<=flats.length-1;i++){
            for(j=0;j<=flats[i].length-1;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
                System.out.println();
        }
    }
}

