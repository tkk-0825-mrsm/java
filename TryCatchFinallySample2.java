//�e�b�N�u�[�X�g�@���@2�@�ۑ�3 ���������ǂ悭�킩��Ȃ�
import java.util.logging.*;

public class TryCatchFinallySample2 {

private static Logger logger = Logger.getLogger(TryCatchFinallySample2.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.ALL);

		try {
			logger.warning("WARNING");
			Integer.parseInt(args[0]);
		} catch (Exception e) {
			logger.severe("SEVERE");
		} finally {
			logger.info("INFO");
		}
	}
}
