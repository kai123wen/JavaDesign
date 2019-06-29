
public class ObserverOne implements Observer {

	private Subject subject;// 每个观察者都有用一个主题的对象

	public ObserverOne(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	@Override
	public void update(String msg) {
		System.out.println("observer-one 接受到消息 ：" + msg);
	}
}
