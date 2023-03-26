package FlyWeight;

import java.util.Random;

interface Phone{ 
	  public void color(String color);
	  public void phoneFunction();
}

public class FlyWeightPattern {
	static String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	static String os[] ={"Android", "IOS"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) { 
			Phone p = PhoneFactory.getPhone(getRandomPhone());
			String targetColor=getRandomColor(); 
			String targetPhone= getRandomPhone();
			p.color(targetColor);
			p.phoneFunction();
			}
	}

	public static String getRandomColor() {
        Random r = new Random();
        int randInt = r.nextInt(colors.length);
        return colors[randInt];
	}
    public static String getRandomPhone()
    {
        Random r = new Random();
        int randInt = r.nextInt(os.length);
        return os[randInt];
    }
}