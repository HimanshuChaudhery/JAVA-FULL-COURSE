public class break_loop{
    public static void main(String[] args) {
        int num = 10;

        for(int i=1;i<=num;i++){
            if(i==5){
                break;
            }
            System.out.print(i+" ");
        }
    }
}