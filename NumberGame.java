//���K3�|6
public class NumberGame {
    public static void main(String [] args){
        System.out.println("�y�����ăQ�[���z");
       int ans = new java.util.Random().nextInt(10);
       for(int i=0; i<5; i++){
       System.out.println("0~9�̐�������͂��Ă�������");
       
       int num = new java.util.Scanner(System.in).nextInt();
       if(num ==ans){
        System.out.println("�A�^���I");
        }
        if(num != ans){
            System.out.println("�Ⴂ�܂�");
        }
        //else{System.out.println("�Ⴂ�܂�");}
        
    }
    System.out.println("�Q�[�����I�����܂�");
}
}