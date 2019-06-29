
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelSingle
 * @class_name: SingletonOne
 * @class_describe: ����ģʽ֮����ʽ
 * @establish_time: 2019��2��20�� ����7:10:25
 * @version:
 */
public class SingletonOne {
	private static SingletonOne instance = new SingletonOne();

	private SingletonOne() {
	}

	public static SingletonOne getInstance() {
		return instance;
	}
}
