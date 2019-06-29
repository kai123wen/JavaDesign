
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelSingle
 * @class_name: SingletonTwoLazy 
 * @class_describe: 懒汉式的单例模式，只有当getInstance()这个方法被调用后才会创建对象，但是存在着线程安全问题
 * @establish_time: 2019年2月20日 下午7:55:01
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
