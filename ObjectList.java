//�e�b�N�u�[�X�g�@�ۑ�3�@(����̓����ʂ���)
//ObjectList.java class
import java.util.ArrayList;

//ArrayList�̃R�[�h�@<>�̒��͂Ȃ�łs�Ȃ́H
public class ObjectList<T> extends ArrayList<T> {

    public boolean add(T value) {
		return super.add(value);
	}

	public T get(int index) {
		return super.get(index);
	}
}
