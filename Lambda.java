//�e�b�N�u�[�X�g�@���@3�ۑ�4
//�����_���Ō��݂̎��� (HH:mm:ss.SSS) �Ɣ��p�X�y�[�X�� 1 ���� 9999 �̘A��
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10000);
        //�����_��
		stream.forEach(FORMATTER -> System.out.println(�B));
	}

	private static String currentTime() {
		return FORMATTER.format(LocalDateTime.now());
	}
}

