//文法１　switch文
public class PrimeNumber{
    public static void main(String[]args){
        int primeNumber= 4;
        switch (primeNumber) {
            case 2:
            System.out.println("素数です");
            break;
            case 3:
            System.out.println("素数です");
            break;
            case 5:
            System.out.println("素数です");
            break;
            case 7:
            System.out.println("素数です");
            break;
            case 11:
            System.out.println("素数です");
            break;
            //これ以降の素数は省略
            default:
            System.out.println("素数ではありません");

        }
    }

    
}