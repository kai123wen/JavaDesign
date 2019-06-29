package FactoryModelTwoFENDIAN;

/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelFactory
 * @class_name: StoreRoujiamo
 * @class_describe: ���ù������̵�
 * @establish_time: 2019��2��20�� ����11:51:15
 * @version:
 */
public abstract class StoreRoujiamo {

	public void sellRoujiamo(String type) {
		Roujiamo mo = creatRoujiamoByType(type);
		mo.makeRoujiamo();
	}

	/**
	 *  ���ɲ�ͬ����������
	 * @param type
	 * @return
	 */
	public abstract Roujiamo creatRoujiamoByType(String type);
}
