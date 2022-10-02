//�e�b�N�u�[�X�g�@���@3 �ۑ�3 �񋓌^�ȊO�͗����ł��ĂȂ�
//TextReader class

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());
    
    //�񋓌^���Ă��Ƃ�enum?
	public enum Mark {START, END
	};

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
        //TODO: ���� `valueList` �ϐ���Integer�̃C���X�^���X�����ǉ����Ȃ��̂ŁA���̌^�𗘗p����ObjectList���g���悤�ɏ�������
        //�񓚂悭�킩��Ȃ��@Integer�ǂ����炫���H
		List<Integer> valueList = new ObjectList<>();
        
        // TODO: ���\�[�X�t�� try �����g��
        //()���ɂ�close�ɂ���Еt�����K�v�ȕϐ��̐錾�@�{���̏���
		try (FileReader fr = new FileReader(path);BufferedReader br =
         new BufferedReader(fr)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line));
			}
    
        //��O����
		} catch (IOException e) {
			e.printStackTrace();
		}
        // TODO: �g�� for ���𗘗p
		for (Integer value : valueList) {
			System.out.println(value);
		}
	}
   
    // TODO: �����ŉϒ�����:�s���I�h��3���ׂ�
	public static void main(String...args) {
		logger.info(Mark.START.name());
		new TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}

}
