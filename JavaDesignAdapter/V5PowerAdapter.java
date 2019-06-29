
/**
 * @author: Guo Zhenhao
 * @project_name: JavaModelAdapter
 * @class_name: V5PowerAdapter 
 * @class_describe: ���220vת5v��������
 * @establish_time: 2019��2��21�� ����12:56:43
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
		 * �м侭��һϵ��ת�� 220 -> 5
		 */
		System.out.println("�������������ҽ��е�ѹ����");
		
		return 5;
	}
	
	
}
