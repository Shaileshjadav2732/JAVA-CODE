public class sum_array {
    public static void main(String[] args){
        float [] num={78.5f,67.8f,78.27f,90.007f};
        float sum=0;
        for(float element:num){
            sum=sum + element;
        }
            System.out.println(sum);
    }
}
