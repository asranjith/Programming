package lambdaExpression;

public class Cars implements Comparable {
	String name;
	double price;

	Cars() {

	}

	Cars(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return name + " " + price;
	}

	public int compareTo(Object o) {
		Cars c1 = (Cars) o;
		if (this.price == c1.price) {
			return 0;
		} else if (this.price > c1.price) {
			return 1;
		} else {
			return -1;
		}
		// return this.name.compareTo(c1.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
