package lambdaExpression;

public class Car {
	String name;
	double price;
	
      Car(){
		 
	    }
    
	 Car(String name,double price){
		 this.name=name;
		 this.price=price;
	}
	 
	 public String toString() {
		 return name+" "+price;
	 }

}
