//�e�b�N�u�[�X�g�@���@2 �ۑ�2
public class TryCatchFinallySample {

	//������catch���Ă���@
	//�ǂ�ȃf�[�^���킩��Ȃ����̂������Ƃ��Ĉ�������Ă���(�m�肵�ĂȂ������������)
	public static void main(String[] args) { //���������邽�߂̔z��
		
		//try�̒��ɏ���������
		try{
			System.out.println("try");
			
			//Integer.parseInt:���Ƃ���java�ɓ����Ă郁�\�b�g�@String�^����int�^�ɕϊ��������
			Integer.parseInt(args[0]);	//[]����������̔��@�z����Ӗ�����@0�Ȃ̂ł����΂�ŏ��̔z��
		
			//catch:try�̒��Ŗ�肪�N�������̏��u(�G���[�ɂȂ�Ȃ��悤�ɁA�����I�����Ȃ����߂̏��u) 
		//�G���[���b�Z�[�W�Ƃ��Ń��[�U�[��U�����鏈���@�G���[�ŗ����Ȃ��悤��
		} catch (Exception e) {
			System.out.println("catch"); //�G���[�ɂ��Ẵ��b�Z�[�W���c���@���O���c�����ی��������Ă���@�v��ʎ��ԂɑΉ�
		
		//try�̏������I��������΂ɂ�肽�������@�ȗ����Ă�OK(���ɂ�肽�����Ƃ��Ȃ����)
		} finally {
			System.out.println("finally"); //ex)�J�����t�@�C������鏈���A�f�[�^�x�[�X�̐ڑ��̎Ւf�A����
		}
	}
}
