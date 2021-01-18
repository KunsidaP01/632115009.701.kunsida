package week7;
public class Pet{

    //632115009 Kunsida Phitakham

    String name,species,color,kind;
    int age;

    public Pet(){
    }
    public void showPetData(){
        System.out.println("My "+kind);
        System.out.println("Name: "+name+" Species: "+species+" Color: "+color+" Age: "+age);
      
    }
}
class Dog extends Pet{
    String size;
    String checkHair;
    public Dog(String name,String species,String color,int age){
        this.name=name;
        this.species=species;
        this.color=color;
        this.age=age;
    }
    public void Run(String run){
        System.out.println("My "+kind+" is run "+run);
    } 
    public void Bark(String bark){
        System.out.println("It is so "+size+" And bark "+bark);
    }
    public void isShortHair(String hair){
        if(hair.equals("Short hair")){
            System.out.println("Short hair: true");
        }
        else System.out.println("Short hair: false");
          
    }  
}
class Fish extends Pet{
    String size,saltOrFreshWater;
    int swimSpeed;
    public Fish(String name,String species,String color,int age){
        this.name=name;
        this.species=species;
        this.color=color;
        this.age=age;
    }
    public void isSwimToTheSea(String swimWhere){
        if(swimWhere.equals("Swim to the sea")){
            System.out.println("My "+kind+" is swim to the sea");
        }
        else System.out.println("My "+kind+"is not wim to the sea");
    }
    public void SwimFast(){
        System.out.println("It's cute and "+size+" The swim Speed: "+swimSpeed+" cm/s");
    }
}
class Bird extends Pet{
    String country,canFly;
    public Bird(String name,String species,String color,int age){
        this.name=name;
        this.species=species;
        this.color=color;
        this.age=age;
    }
    public void Speak(String speak){
        if(speak.equals("yes")){
            System.out.println("It can speak");
        }
        else System.out.println("My "+kind+" is cannot speak");  
    }  
    public void CheckCountrry(){
        System.out.println(name+" is from "+country);
    }
    public void isCanFly(){
        if(canFly.equals("yes")){
            System.out.println("My "+kind+" can fly");
        }
        else System.out.println("My "+kind+" cannot fly");  
    }  
}