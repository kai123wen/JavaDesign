
public class ObserverTwo implements Observer{
	private Subject subject;//ÿ���۲��߶�����һ������Ķ���
	
	public ObserverTwo(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(String msg) {
		System.out.println("observer-two ���ܵ���Ϣ �� " + msg);
	}
}
