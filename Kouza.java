//���K4-2
public class Kouza{
    public static void main (String[]args){
        int [] moneyList = {121902,8302,55100};
        //for���@�܂����͂ŏ����Ȃ�����
        for(int i = 0; i<moneyList.length; i++){
        System.out.println(moneyList[i]);
    }
    //�g��for�� �𓚌��Ȃ���
    for (int m :moneyList){
        System.out.println(m);
    }
  }
}