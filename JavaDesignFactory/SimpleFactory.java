
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: SimpleFactory
 * @class_describe: ����ģʽ�еĹ�����
 * @establish_time: 2019��2��20�� ����11:29:54
 * @version:
 */
public class SimpleFactory {
	public Roujiamo creatRoujiamoByType(String type) {
		Roujiamo mo = null;
		switch (type) {
		case "suan":
			mo = new RoujiamoSuan("��ζ�����");
			break;
		case "la":
			mo = new RoujiamoLa("��ζ�����");
			break;
		default:
			break;
		}
		return mo;
	}
}
