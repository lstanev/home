package lacho.app.test;

public class Apple {

public Apple(int weight, Color color) {
		super();
		this.weight = weight;
		this.color = color;
	}

private final int weight;
private final Color color;
//Color 
public int getWeight() {
	return weight;
}

public Color getColor() {
	return color;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Appele weight: "+ weight + " color: " + color.name() ;
	}

}
