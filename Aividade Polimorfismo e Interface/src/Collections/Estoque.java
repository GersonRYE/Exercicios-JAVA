package Collections;

public class Estoque {
	private String item;

	public Estoque(String item) {
		super();
		this.item = item;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Estoque [item =  " + item + "]";
	}

}
