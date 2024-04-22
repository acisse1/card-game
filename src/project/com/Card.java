package project.com;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		
		System.out.println("The card's information: ");
		System.out.println("name: " + this.name);
		System.out.println("value: " + this.value);
	}
	
	

}
