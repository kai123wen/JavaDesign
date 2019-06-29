
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelSingle
 * @class_name: SingletonOne
 * @class_describe: 单例模式之饿汉式
 * @establish_time: 2019年2月20日 下午7:10:25
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
