//���K8-1 Cleric class 
//���K8�|2�͂��܂����ł��Ȃ����� 
//���K8�|3 static�g��Ȃ����R�́H�@�𓚌��Ȃ��Ƃł��Ȃ�����
//���K8�|4�@�𓚌��Ȃ��Ƃł��Ȃ�����

import java. util.*;

public class Cleric{
    public void main(String[]args){
        String name;
        int hp =50;
        final int Max_HP =50;
        int mp =10;
        final int Max_MP =10;
    }
    public void selfAid(){
        System.out.println(this.name+"�́A�Z���t�G�C�h��������!");
        this.hp=this.Max_HP;
        this.mp-=5;
        System.out.println("HP���ő�܂ŉ񕜂���!");
    }
    public int pray(int sec){
        System.out.println(this.name+"��"+sec+"�b�ԁA�V�ɋF����!");
        //�����_���Ń|�C���g
        int recover= new java.util.Random().nextInt(3)+sec;
        
        //�|�C���g�␳(���ۂ̉񕜗�)
        int recoverActual =Math.min(this.Max_MP - this.MP,recover);

        this.mp += recoverActual;
        System.out.println("MP��"+recoverActual+"�񕜂���!");
        return recoverActual;
    }
}
