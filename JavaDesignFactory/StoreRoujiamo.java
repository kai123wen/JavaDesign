
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: StoreRoujiamo 
 * @class_describe: ���ù������̵�
 * @establish_time: 2019��2��20�� ����11:51:15
 * @version: 
 */
public class StoreRoujiamo {
	private SimpleFactory factory;
	public StoreRoujiamo(SimpleFactory factory) {
		this.factory = factory;
	}
	
	public void sellRoujiamo(String type) {
		Roujiamo mo = factory.creatRoujiamoByType(type);
		mo.makeRoujiamo();
	}
}
