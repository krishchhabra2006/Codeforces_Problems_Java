import java.util.*;
public class A_Don_t_Try_to_Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0){
                int n =sc.nextInt();
                int m =sc.nextInt();
                String x =sc.next();
                String s =sc.next();
                boolean found =false;
                for(int ops=0;ops<=5;ops++){
                    if(x.contains(s)){
                        System.out.println(ops);
                        found =true;
                        break;
                    }
                    x+=x;
                }
                if(!found)System.out.println(-1);
            }
        }
    }
}
