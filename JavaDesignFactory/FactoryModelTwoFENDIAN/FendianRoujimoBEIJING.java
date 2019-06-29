package FactoryModelTwoFENDIAN;

/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: FendianRoujimoBEIJING 
 * @class_describe: 模拟肉夹馍西安分店
 * @establish_time: 2019年2月20日 下午3:46:32
 * @version: 
 */
public class FendianRoujimoBEIJING extends StoreRoujiamo{

	private Roujiamo mo = null;
	@Override
	public Roujiamo creatRoujiamoByType(String type) {
		switch(type) {
		case "BEIJINGsuan":
			mo = new RoujiamoLa("北京酸味肉夹馍");
			break;
		case "BEIJINGla":
			mo = new RoujiamoLa("北京辣味肉夹馍");
			break;
		}
		return mo;
	}

}
