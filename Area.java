//���K5-4 �߂�l���悭�킩��Ȃ�
public class Area{
    public static void main (String []args){
        double  triangleArea = calcTriangleArea(10.0,5.0);
        System.out.println(
            "�O�p�`�̖ʐ�:"+triangleArea+"?"
        );
        double circleArea = calcCircleArea(5.0);
        System.out.println(
            "�~�̖ʐ�:"+circleArea+"?");
        }
        public static double calcTriangleArea(double bottom,double height){
            double area =(bottom*height)/2;
        return area;
         }
        public static double calcCircleArea(double radius){
            double area=radius*radius*3.14;
            return area;

        }    
    }


    