
package Homeactivity3;

public class Distance {
    public int feet , inches;
    public Distance(){
    feet = 16;
    inches = 7;
    }
    public Distance(int a, int b){
    feet = a;
    inches = b;
    }
    public void display(){
        System.out.println("Feet = "+feet);
        System.out.println("Inches = "+inches);
        System.out.println();
    }
}
