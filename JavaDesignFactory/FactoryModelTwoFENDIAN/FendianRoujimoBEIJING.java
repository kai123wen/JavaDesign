package FactoryModelTwoFENDIAN;

/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: FendianRoujimoBEIJING 
 * @class_describe: ģ������������ֵ�
 * @establish_time: 2019��2��20�� ����3:46:32
 * @version: 
 */
public class FendianRoujimoBEIJING extends StoreRoujiamo{

	private Roujiamo mo = null;
	@Override
	public Roujiamo creatRoujiamoByType(String type) {
		switch(type) {
		case "BEIJINGsuan":
			mo = new RoujiamoLa("������ζ�����");
			break;
		case "BEIJINGla":
			mo = new RoujiamoLa("������ζ�����");
			break;
		}
		return mo;
	}

}
