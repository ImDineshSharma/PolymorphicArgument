// Main class
public class TEST{
  public static void main(String[] args) {
    fatty fattyObject = new fatty();
    Food FoodObject = new Food();
    fattyObject.digest(FoodObject); // we are using polymorthic argument to call a method from super class Food, 
    //this will output: "This is a delicious food!"
    
    // coz Food and its other subclasses connected through inheritance we can do this to them also, this is ho we do it
    Food BurgerObject = new Burger();
    fattyObject.digest(BurgerObject); // as you might guess, this will output: "This Burger is not so good!"
  }
}

// super class Food

Public class Food{
  public void eat(){
    System.out.println("This is a delicious food!");
  }
}


// sub class Burger
class Burger extends Food{
   @Override // coz we r doing some modifications to the eat method which is inherited form super class Food
   public void eat(){
      System.out.println("This Burger is not so good!");
   }
}

// sub class Pizza
class Pizza extends Food{

  @Override
  public void eat(){
     System.out.println("This pizza is dammn good!!");
  }
}

// digest class
public class Fatty{

   public void digest(Food x){
      x.eat(); // when you pass the food object to digest method in test class the eat method will be called of super class
      //we can do this for subclasses too
   }
}
