import java.util.Scanner;
class Trafficlight{
    String color;
    double duration;

    Trafficlight(String color, double duration){
        this.color =  color;
        this.duration = duration;
    }
    void change(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the color to change:");
        color = input.nextLine();
        if(color.equals("red")){
            System.out.println("Red color is on active status.");
            System.out.println("This is the duration" + duration);
        }
        else if(color.equals("green")){
            System.out.println("Green color is on active status.");
            System.out.println("This is the duration" + duration);
        }
        else{
            System.out.println("Enter not in capital letter.");
        }
    }

}
class Demo2{
    public static void main( String []args){
        Trafficlight light= new Trafficlight("yellow",10);
        System.out.println("This is the current status of light: " + light.color);
        System.out.println("The current duration of light is: " + light.duration);
        light.change();

    }
}