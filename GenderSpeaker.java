//�e�b�N�u�[�X�g�@���@3 �ۑ�2�@�����߂��܂������킩��Ȃ��@�|�����[�t�B�Y�����ĂȂɁH
//GenderSpeaker class(�������s�N���X)
public class GenderSpeaker{
    public static void main(String[]args){

		//dospeak���\�b�g���Ăяo���@���\�b�g��();�Ń��\�b�g�����Ăяo��    
        doSpeak(new Man()); //�C���X�^���X������Ă���������Ƃ��ēn���@Man�^�̃C���X�^���X
		doSpeak(new Woman());
	}

	//��������������Ă���()�̒��̌^�ɂ�����������n���@public�͂ǂ�����ł��Ăяo����@�N������邩�g���邩
	//�e�N���X�̌^���󂯎���Ă���@man��woman�͌p����(�eclass���ꏏ)�������Ȃ̂ł���1�ł܂��Ȃ���
	public static void doSpeak(AbstractPerson person) {
		
		//�C���X�^���X.���\�b�g��();�Ń��\�b�g���Ăяo��
		person.speak(); //Man class��
}
}
