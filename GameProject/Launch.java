package GameProject;
//This project is console based
import java.util.Scanner;

class Gueser{
    int guessNum;
    int guessingNumber()
    {
        System.out.println("Guesser! kindly guess the number");
        Scanner scan=new Scanner(System.in);
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Player{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("player kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Umpire{
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
  void  collectNumFromGusser(){
        Gueser g=new Gueser();
        numFromGusser=g.guessingNumber();

    }
    void collectNumFromPlayers()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();

    }
     void compare()
    {
        if(numFromGusser==numFromPlayer1)
        {
            if(numFromGusser==numFromPlayer2&&numFromGusser==numFromPlayer3)
            {
                System.out.println("Sab winner he");
            }
            else if(numFromGusser==numFromPlayer2)
            {
                System.out.println("Player 1 , Player 2 jeet gaye");
            }
            else if(numFromGusser==numFromPlayer3)
            {
                System.out.println("Player 1, Player 3 jeet gaye");
            }
            else
            {
                System.out.println("Player1 won the game");
            }
            
        }
        else if(numFromGusser==numFromPlayer2)
        {
            if(numFromGusser==numFromPlayer3)
            {
                System.out.println("Player2, Player3 jeet gaye");
            }
            else
            {
                System.out.println("Player2 won the game");
            }
            
        }
        else if(numFromGusser==numFromPlayer3)
        {
            System.out.println("Player3 won the game");
        }
        else
        {
            System.out.println("Sab ke sab galat he");
        }

    }
}

public class Launch {
    
    public static void main(String args[])
    {
        System.out.print("Game Started ");
        Umpire u=new Umpire();
        u.collectNumFromGusser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
