//�e�b�N�u�[�X�g�@���@3 �ۑ�2�@�����߂��܂������킩��Ȃ��@�|�����[�t�B�Y�����ĂȂɁH
//GenderSpeaker class(�������s�N���X)
public class GenderSpeaker{
    public static void main(String[]args){
        doSpeak(new Man());
		doSpeak(new Woman());
	}

	private static void doSpeak(AbstractPerson person) {
		person.speak();
}
}
