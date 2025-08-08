public class Car {
      String name;
      int number;
      String brand;
      // method 
      void displaydetail(){
        System.out.println("Name : "+name);
        System.out.println("number :"+number);
        System.out.println("brand : "+brand);


        
      }
    public static void main(String[] args) {
      // create object 
      Car mycar=new Car();
      // acessing 
       mycar.brand="Tayota";
       mycar.number=38249;
       mycar.displaydetail();

        
    }
    
}
