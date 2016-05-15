package lacho.app.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppleCreater {

	public static List<Apple> createApples(){
		List<Apple> basket = new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			Random random = new Random();
			int randomNumber = random.nextInt(200 - 50) + 50;
			int color=random.nextInt(2);
			if (color==0)
			basket.add(new Apple(randomNumber,Color.Red ));
			if (color==1)
				basket.add(new Apple(randomNumber,Color.Green ));
			if (color==2)
				basket.add(new Apple(randomNumber,Color.Yellow ));
		}
		return basket;
		
	}
}
