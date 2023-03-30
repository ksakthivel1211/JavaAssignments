package FlyWeight;

import java.util.Random;

public class FlyWeightPattern {
	static String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	static String phone[] ={"Samsung", "Apple"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) { 
			Phone phone = PhoneFactory.getPhone(getRandomPhone());
			String targetColor=getRandomColor(); 
			phone.color(targetColor);
			phone.phoneFunction();
			}
	}

	public static String getRandomColor() {
        Random random = new Random();
        int randInt = random.nextInt(colors.length);
        return colors[randInt];
	}
    public static String getRandomPhone()
    {
        Random random = new Random();
        int randInt = random.nextInt(phone.length);
        return phone[randInt];
    }
}