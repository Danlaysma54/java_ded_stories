public class Main {
    public static void main(String[] args) {
        int m=26;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if((i*j)%m==1){
                    System.out.printf("(%d,%d)\n",i,j);
                }
            }
        }
    }
}