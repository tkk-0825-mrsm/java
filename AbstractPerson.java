//�e�b�N�u�[�X�g�@���@3�@�ۑ�2�@ 
//AbstractPerson class �����߂悭�킩��Ȃ��@new�ł��Ȃ��ꍇ�̃C���X�^���X���́H
//���ۃ��\�b�g���܂ރN���X�錾
public abstract class AbstractPerson{
    public abstract String getGender();
    public void speak(){
        System.out.println("I'm a " + getGender()); //�Ȃ�getGender()�Ȃ̂�
    }
}