package FactoryModelTwoFENDIAN;

/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: FendiaoRoujiamoXIAN 
 * @class_describe: ģ�ⱱ���ֵ�
 * @establish_time: 2019��2��20�� ����3:51:04
 * @version: 
 */
public class FendiaoRoujiamoXIAN extends StoreRoujiamo{
	private Roujiamo mo = null;
	@Override
	public Roujiamo creatRoujiamoByType(String type) {
		switch(type) {
		case "XIANla"://������
			mo = new RoujiamoLa("������ζ�����");
			break;
		case "XIANsuan":
			mo = new RoujiamoLa("������ζ�����");
			break;
		}
		return mo;
	}
}
