package FactoryModelTwoFENDIAN;

/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: FendiaoRoujiamoXIAN 
 * @class_describe: 模拟北京分店
 * @establish_time: 2019年2月20日 下午3:51:04
 * @version: 
 */
public class FendiaoRoujiamoXIAN extends StoreRoujiamo{
	private Roujiamo mo = null;
	@Override
	public Roujiamo creatRoujiamoByType(String type) {
		switch(type) {
		case "XIANla"://西安辣
			mo = new RoujiamoLa("西安酸味肉夹馍");
			break;
		case "XIANsuan":
			mo = new RoujiamoLa("西安辣味肉夹馍");
			break;
		}
		return mo;
	}
}
