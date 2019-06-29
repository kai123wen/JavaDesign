
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: SimpleFactory
 * @class_describe: 工厂模式中的工厂类
 * @establish_time: 2019年2月20日 上午11:29:54
 * @version:
 */
public class SimpleFactory {
	public Roujiamo creatRoujiamoByType(String type) {
		Roujiamo mo = null;
		switch (type) {
		case "suan":
			mo = new RoujiamoSuan("酸味肉夹馍");
			break;
		case "la":
			mo = new RoujiamoLa("辣味肉夹馍");
			break;
		default:
			break;
		}
		return mo;
	}
}
