//�e�b�N�u�[�X�g�@���@2�ۑ�1 �����^�[����Ɖ񓚎Q��
import java.util.HashMap; //���Ƃ���java�ɓ����Ă����
import java.util.Map;     //���Ƃ���java�ɓ����Ă����

public class Recorder {
 private Map<String, String> map = new HashMap<>(); //����class�ł����g��Ȃ� <>����key�̌^��value�̌^�@
//�}�b�v�ɓo�^���邽�߂̃��\�b�g
	public void put(String key, String value) { //�����������
		map.put(key, value); //map�ɓo�^�H�@�B��put
		System.out.println(key+"="+value); //�ŏ��ɒ�`���Ă��邩��String�͂���Ȃ�
	}
	//�}�b�v��key�����݂��鎞��value���o�͂���(�o�^�ς̎�)
	public void get(String key) {
		if (!map.containsKey(key)) {   //��肽�����Ƃ̑O�Ƀ`�F�b�N������ key�����邩�ǂ��� ����!�����Ă���faule�������炢���Ӗ� �E��containskey
			throw new IllegalArgumentException(); //�F��throw �G���[���e��\������@map.containskey��faulse�������� if���ɓ���Ȃ������ꍇ
		}
	
		System.out.println(map.get(key));
	}
	
	//����������Ƃ�
    public void delete(String key) {
		if (!map.containsKey(key)) {
			throw new IllegalArgumentException(); //�F��throw key���}�b�v�ɑ��݂��Ȃ�������
		}

		map.remove(key); //�G��remove�@�@1����key��n��
		System.out.println("deleted: "  + key); 
	}
	
	//�������Ȃ��Ƃ�
    public void delete() {
		map.clear();     //�H��clear �}�b�v�ɓ����Ă�����̂͂��ׂč폜
		System.out.println("deleted all"); 
	}
}
