package C1;

public class b11 {

    public void solveFunc(int n){
        int s = 1;
        if(n % 2 == 0 ){
            for(int i = 1; i <= n; i++)
                if(i % 2 == 0)
                    s *=i;
        }else{
            for(int i = 1; i <= n; i++){
                if(i % 2 != 0){
                    s *=i;
                }
            }  
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int n = 10;
        b11 obj = new b11();
        obj.solveFunc(n);
    }
}
