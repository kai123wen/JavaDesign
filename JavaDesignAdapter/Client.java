
public class Client {
	public static void main(String[] args) {
		V220Power v220 = new V220Power();
		V5PowerAdapter adapter = new V5PowerAdapter(v220);
		Mobile mobile = new Mobile();
		mobile.inputV5Power(adapter);
	}
}
