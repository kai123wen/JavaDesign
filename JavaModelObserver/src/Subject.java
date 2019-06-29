
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelObserver
 * @class_name: Subject
 * @class_describe: �۲���ģʽ�У���������ӿ�
 * @establish_time: 2019��2��14�� ����10:51:33
 * @version:
 */
public interface Subject {
	/**
	 * ע��һ���۲���
	 */
	public void registerObserver(Observer observer);

	/**
	 * ɾ��һ���۲���
	 */
	public void removeObserver(Observer observer);

	/**
	 * ֪ͨ���й۲���
	 */
	public void notifyObservers();
}
