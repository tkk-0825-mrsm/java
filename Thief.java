//���K9-1
public class Thief{
    String name;
    int hp;
    int mp;
 public Thief(String name,int hp,int mp){ //���O�AHP�AMP���w�肵�ăC���X�^���X��(�悭�킩��Ȃ�)
    this.name=name;
    this.hp=hp;
    this.mp=mp;
 }

 public Thief(String name,int hp){  //���O�AHP�����w�� MP��5�ŏ����������(���͂łł���)
    this(name,hp,5);  //�ŏ��̃R���X�g���N�g����Ăяo���H
}
 public Thief(String name){  //���O�����w�肵�ăC���X�^���X��(this�̌��͈����Ȃ̂�String�͂���Ȃ�)
    this(name,40,5);
 }
}