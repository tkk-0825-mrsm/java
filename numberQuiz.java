//���K4-4
public class numberQuiz{
    public static void main (String[]args){
        int [] numbers ={3,4,9};
        System.out.println("1���̐�������͂��Ă�������");
        //����������͉𓚊m�F����
        int input = new java.util.Scanner(System.in).nextInt();
        //�z����񂵂Ȃ��画��
        for(int n:numbers){
            if(n == input){
                System.out.println("�A�^���I");
            }
        }
    }    
}