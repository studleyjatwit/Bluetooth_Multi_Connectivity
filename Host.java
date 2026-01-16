
package testing;

 public class Host {
private final Headphone[] headphones;

public Host(Headphone[] headphones) {
    this.headphones = headphones;
}

public void start() {
    System.out.println("\n Host Phone sending audio to " + headphones.length + " Headphones\n");
    
   //Passing the artificial data
    for (int i = 0; i < 5; i++) {
        String data = "Audio" + i;
        long sendTime = System.currentTimeMillis();
        System.out.println("host playing: " + data + " at time: " + sendTime + "ms");
        
        // Send to all headphones at once
        for (Headphone headphone : headphones) {
            headphone.receiveData(data);
        }
        
        // simulate interferences casuing delay on the wavelength microwaves radios exe... 
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println();
    }
}
}