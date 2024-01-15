package main;

public class Hedgehog {
    String name;
    int age;

    public Hedgehog () {
        name = "Pikseli";
        age = 5;
    }
 
    public Hedgehog (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak(String input) {
        System.out.println(name + ": " + input + ".");
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    
    }
    public void run(int count){
        if (count <= 0){
            return;
        }
        System.out.println(name + " juoksee kovaa vauhtia!");
        run(count - 1);
    }
}
