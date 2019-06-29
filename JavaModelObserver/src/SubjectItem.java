import java.util.ArrayList;
import java.util.List;

public class SubjectItem implements Subject {

	private List<Observer> observerList = new ArrayList<Observer>();
	private String msg;

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observerList.contains(observer)) {
			observerList.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observerList) {
			o.update(msg);
		}
	}
	
	/**
	 *  主题更新消息
	 */
	public void setMsg(String msg) {
		this.msg=msg;
		notifyObservers();
	}
}
