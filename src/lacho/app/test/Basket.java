package lacho.app.test;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Basket {
    static	List<Apple> apples =AppleCreater.createApples();


    List<Apple> selected;
	public void fill(Predicate<Apple> p){
		selected =  apples.stream().filter(a-> p.test(a)).collect(Collectors.toList());
				
	}

	public static void main(String[] args){
	//List<Apple> apples =AppleCreater.createApples();
	//apples.stream().count();
	System.out.println(apples.stream().count());	
	Basket basket = new Basket();
	basket.fill(a->a.getColor()== Color.Green && a.getWeight()>130 );
	basket.selected.stream().forEach(a -> System.out.println(a.toString()));
	
	
	}
}
