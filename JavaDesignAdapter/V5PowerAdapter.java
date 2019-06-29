
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelAdapter
 * @class_name: V5PowerAdapter 
 * @class_describe: 完成220v转5v的适配器
 * @establish_time: 2019年2月21日 下午12:56:43
 * @version: 
 */
public class V5PowerAdapter implements V5Power{
	private V220Power v220;
	public V5PowerAdapter(V220Power v220) {
		this.v220 = v220;
	}
	@Override
	public int provideV5Power() {
		int power = v220.providV220Power();
		/*
		 * 中间经过一系列转化 220 -> 5
		 */
		System.out.println("我是适配器，我进行电压适配");
		
		return 5;
	}
	
	
}
