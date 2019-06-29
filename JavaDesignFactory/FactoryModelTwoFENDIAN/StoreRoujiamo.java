package FactoryModelTwoFENDIAN;

/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: StoreRoujiamo
 * @class_describe: 调用工厂的商店
 * @establish_time: 2019年2月20日 上午11:51:15
 * @version:
 */
public abstract class StoreRoujiamo {

	public void sellRoujiamo(String type) {
		Roujiamo mo = creatRoujiamoByType(type);
		mo.makeRoujiamo();
	}

	/**
	 *  生成不同种类的肉夹馍
	 * @param type
	 * @return
	 */
	public abstract Roujiamo creatRoujiamoByType(String type);
}
