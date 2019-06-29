
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelObserver
 * @class_name: Observer 
 * @class_describe: 所有观察者实现此接口
 * @establish_time: 2019年2月15日 下午8:17:20
 * @version: 
 */
public interface Observer {
	/**
	 *  观察者数据更新
	 */
	
	public void update(String msg);
}
