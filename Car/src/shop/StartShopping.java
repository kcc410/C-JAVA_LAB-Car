package shop;

public class StartShopping {

	public static void main(String[] args) {
		
		MyShop myshop = new MyShop();
		
		myshop.setTitle("현대자동차");
		myshop.genProduct();
		myshop.setExistingUsers("김민아", "이철민", myshop.existingUsers);
		myshop.initAlarm();
	}

}
