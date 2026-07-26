import java.util.*;

public class C_Move_Brackets{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                String s=sc.next();
                int count=0;
                Stack<Character> stack=new Stack<>();
                for(char ch:s.toCharArray()){
                    if(ch=='(' && ch==')') stack.push(ch);
                    else if(ch==')') {
                            count++;
                            stack.push(ch);

                    }
                       

                            
                        
                    
                }
            }
        }
    }
}