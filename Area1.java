//���K�T�|�S �߂�l�̐ݒ肪�悭�킩��Ȃ�
//���K�T�|�R�@�I�[�o�[���[�h�͂悭�킩��Ȃ�

public class Area1{
    public static void main(String[]args){
    double TriangleArea = calcTriangleArea(10.0,5.0);
    System.out.println("�O�p�`�̖ʐς�"+TriangleArea+"����cm");
    double CircleArea = calcCircleArea(5.0);
    System.out.println("�~�̖ʐς�"+CircleArea+"����cm"); 
    }
    public static double calcTriangleArea (double bottom,double height){
        double area = (bottom*height)/2;
        return area;

    }
    public static double calcCircleArea(double radius){
        double area = radius*radius*3.14;
        return area;

    }


}