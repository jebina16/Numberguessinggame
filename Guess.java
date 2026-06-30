import java.util.Scanner;
class Guess{
    public static void GuessNumber(){
        Scanner sc=new Scanner(System.in);
        int number=1+(int)(100 *Math.random());
        System.out.println("Guess a number between 1 to 100:");
        int k=5;
        for(int i=0;i<k;i++){
            
            System.out.println("Guess the number:");
            int guess=sc.nextInt();
            if(number==guess){
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if(number>guess ){
                System.out.println("The number is greater than " + guess);
                
            }
            else if(number<guess ){
                System.out.println("The number is less than " + guess);
            }
        }
        System.out.println("finally. The number was " + number);
    }
        public static void main(String[] args){
        
            GuessNumber();
        }
    
}