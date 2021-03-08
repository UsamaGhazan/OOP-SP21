
package l2hass2.L2HASS2;
public class Time {
    public int hr,min, seconds;
    public Time() {
        
        hr = 5; min = 25; seconds = 55;
    }
    
    public Time(int h, int m, int s ) {   
       
    }
    
    public void hour(int h ) {
        
        h = hr;
    }
    
    public void min(int m ) {
        
        m = min;
    }
    
    public void seconds(int s ) {
        
        s = seconds;
    }
    
    public void displayTime() {
        System.out.println(" Hours: " +hr);
                System.out.println(" Minutes: " +min);
                        System.out.println(" Seconds: " +seconds);
        
    }
    
    
        
    
    
}

