import java.util.*;
public class numbergame{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("---------------------------------------");
        System.out.println("NUMBER GAME");
        System.out.println("---------------------------------------");
        System.out.println("Enter the limits that in number game");
        int lim= sc.nextInt();
        System.out.println("Now the game generating the random number");
        Random  ran = new Random();
        int r1 = ran.nextInt(lim);
        System.out.println("Total points : 400 ");
        int points = 400;
        System.out.println("Chance : 4");
        int chance = 4;
        System.out.println("Enter the number to be guess:");
        int num = sc.nextInt();
        Randomnumber(r1, num, lim , 4,400);
        System.out.println();
        System.out.println("---------------------------------------");
    }
    public static void Randomnumber(int r1,int num,int lim,int chance,int points ){
        while(chance!=0){
            if(r1 == num){
                System.out.println("Yeah! you won the game with "+points+"points");
                return;
            }
            else if(r1<num){
                System.out.println("Oops! you entered number is greater than the random number");
                chance--;
                points = points - 100;
                System.out.println("You have "+points+"with "+chance+" chance");
                if(chance==0){
                    System.out.println("You lost the game,better luck next time");
                    break;
                }
                System.out.println("Enter the another number:");
                num=sc.nextInt();
            }
            else if(r1>num){
                System.out.println("Oops! you entered number is lesser than the random number");
                chance--;
                points=points-100;
                System.out.println("You have "+points+"with "+chance+" chance");
                if(chance == 0 ){
            System.out.println("You lost the game,better luck next time");
        }
        System.out.println("Enter the another number:");
                num=sc.nextInt();
            }
        }
    }
}