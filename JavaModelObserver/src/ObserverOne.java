
public class ObserverOne implements Observer {

	private Subject subject;// ÿ���۲��߶�����һ������Ķ���

	public ObserverOne(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	@Override
	public void update(String msg) {
		System.out.println("observer-one ���ܵ���Ϣ ��" + msg);
	}
}
