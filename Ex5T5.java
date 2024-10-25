import java.util.Random;
public class Ex5T5 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        System.out.println("----------------------");
        
        Random random = new Random();
        
        for(int i = 0; i <10; i++){
            int number = random.nextInt(21);
            int square = (int) Math.pow(number, 2);
            int cube = (int) Math.pow(number, 3);
            System.out.println(number+"\t\t"+square+"\t\t"+cube);
        }
    }
    
}
