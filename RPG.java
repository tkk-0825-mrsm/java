//8�́@RPG class  �_�̐�
public class RPG{
    public static void main(String[]args){
        //�E�Ґ���
    Hero h = new Hero();
    h.name = "�~�i�g";
    h.hp=100;
    Matango m1 =new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    //�`���̎n�܂�
   h.sit(5);
   h.slip();
   h.sit(25);
   h.run();
    }
}
