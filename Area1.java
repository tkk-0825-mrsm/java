//練習５−４ 戻り値の設定がよくわからない
//練習５−３　オーバーロードはよくわからない

public class Area1{
    public static void main(String[]args){
    double TriangleArea = calcTriangleArea(10.0,5.0);
    System.out.println("三角形の面積は"+TriangleArea+"平方cm");
    double CircleArea = calcCircleArea(5.0);
    System.out.println("円の面積は"+CircleArea+"平方cm"); 
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