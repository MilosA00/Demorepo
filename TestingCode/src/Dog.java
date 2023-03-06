public class Dog extends Animal{

   public Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }
    @Override
    public void sleep(boolean isSleaping){
       if(isSleaping){
           System.out.println(getName()+" is sleeping");
       }
       else
           System.out.println(getName()+ " is awake.");
    }

    @Override
    public void talk() {
        System.out.println("Woof Woof bark Bark!");
    }
}
