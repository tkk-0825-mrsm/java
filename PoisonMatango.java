//���K10-3 extends�ȍ~�����Ȃ�����
public class PoisonMatango extends Matango1{
    int PoisonCount = 5; //�ł�p�����U���̏����l5��@�E�̓��e
    public PoinsonMatango(char suffix){
        super(suffix);
    }
    public void attack(Hero h){  //�G�̓��e
        super.attack(h); //�G��1
        if(this.Poisoncount>0){  //�G��2
            System.out.println("����ɓł̖E�q���΂�܂���!"); //�G��3
            int dmg = h.hp/5; //�G��4
            h.hp -=dmg;
            System.out.println(dmg+"�|�C���g�̃_���[�W!");
            this.PoisonCount--; //�G��5
        }
    }

}