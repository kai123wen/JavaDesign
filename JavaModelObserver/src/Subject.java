
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelObserver
 * @class_name: Subject
 * @class_describe: 观察者模式中，构建主题接口
 * @establish_time: 2019年2月14日 下午10:51:33
 * @version:
 */
public interface Subject {
	/**
	 * 注册一个观察者
	 */
	public void registerObserver(Observer observer);

	/**
	 * 删除一个观察者
	 */
	public void removeObserver(Observer observer);

	/**
	 * 通知所有观察者
	 */
	public void notifyObservers();
}
