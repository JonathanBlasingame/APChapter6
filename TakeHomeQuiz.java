import java.util.Scanner;
public class TakeHomeQuiz{
  public static void main(String[] args){
    System.out.println("Enter some numbers between 0 and 100.");
    System.out.println("Signal the end by entering a number out of that range.");
    Scanner scan= new Scanner(System.in);
    int i= scan.nextInt();
    String oneThroughTen= "1-10\t|";
    String elevenThroughTwenty= "11-20\t|";
    String twentyOneThroughThirty= "21-30\t|";
    String thirtyOneThroughFourty= "31-40\t|";
    String fourtyOneThroughFifty= "41-50\t|";
    String fiftyOneThroughSixty= "51-60\t|";
    String sixtyOneThroughSeventy= "61-70\t|";
    String seventyOneThroughEighty= "71-80\t|";
    String eightyOneThroughNinety= "81-90\t|";
    String ninetyOneThroughHundred= "91-100\t|";
    while(i <= 100){
      if(i >= 1 && i <= 10){
        oneThroughTen= oneThroughTen.concat("*");
      }
      if(i >= 11 && i <= 20){
        elevenThroughTwenty= elevenThroughTwenty.concat("*");
      }
      if(i >= 21 && i <= 30){
        twentyOneThroughThirty= twentyOneThroughThirty.concat("*");
      }
      if(i >= 31 && i <= 40){
        thirtyOneThroughFourty= thirtyOneThroughFourty.concat("*");
      }
      if(i >= 41 && i <= 50){
        fourtyOneThroughFifty= fourtyOneThroughFifty.concat("*");
      }
      if(i >= 51 && i <= 60){
        fiftyOneThroughSixty= fiftyOneThroughSixty.concat("*");
      }
      if(i >= 61 && i <= 70){
        sixtyOneThroughSeventy= sixtyOneThroughSeventy.concat("*");
      }
      if(i >= 71 && i <= 80){
        seventyOneThroughEighty= seventyOneThroughEighty.concat("*");
      }
      if(i >= 81 && i <= 90){
        eightyOneThroughNinety= eightyOneThroughNinety.concat("*");
      }
      if(i >= 91 && i <= 100){
        ninetyOneThroughHundred= ninetyOneThroughHundred.concat("*");
      }
      i= scan.nextInt();
    }
    System.out.println(oneThroughTen);
    System.out.println(elevenThroughTwenty);
    System.out.println(twentyOneThroughThirty);
    System.out.println(thirtyOneThroughFourty);
    System.out.println(fourtyOneThroughFifty);
    System.out.println(fiftyOneThroughSixty);
    System.out.println(sixtyOneThroughSeventy);
    System.out.println(seventyOneThroughEighty);
    System.out.println(eightyOneThroughNinety);
    System.out.println(ninetyOneThroughHundred);
  }
}
