
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelSingle
 * @class_name: SingletonTwoLazy 
 * @class_describe: ����ʽ�ĵ���ģʽ��ֻ�е�getInstance()������������ú�Żᴴ�����󣬵��Ǵ������̰߳�ȫ����
 * @establish_time: 2019��2��20�� ����7:55:01
 * @version: 
 */
public class SingletonTwoLazy {
	private static SingletonTwoLazy instance = null;
	private SingletonTwoLazy() {}
	public static SingletonTwoLazy getInstance() {
		if(instance == null) {
			instance = new SingletonTwoLazy();
		}
		return instance;
	}
}
