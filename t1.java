import java.util.Random;

public class HeadsorTails{
public static void main(String[] args) {
    int i=0;
    int j=0;
    int cnt = 0;
    int x=0;
    int heads = 0;

    Random rnd = new Random();
    System.out.println("Tossing a coin...");
    while(cnt<3){
        System.out.print("Round "+(cnt+1)+":");
           x =  rnd.nextInt(5)%2;
        if(x==0) {
            System.out.println("Heads");
            i++;
        }
        if(x==1) {
            System.out.println("Tails");
            j++;
        }
        cnt++;

    }
    System.out.println("Heads: "+i+",Tails:"+j+"");
}
}

