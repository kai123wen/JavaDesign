
public class Client {
	
	public static void main(String[] args) {
		SubjectItem item = new SubjectItem();// 设置一个主题（例如订阅号等实际）
		ObserverOne one = new ObserverOne(item);
		ObserverTwo two = new ObserverTwo(item);
		item.setMsg("1.2 大雪");
		item.setMsg("1.3 晴天");
	}
}
