
package testing;


 public class Headphone {
private final int id;
private int packetsReceived = 0;

public Headphone(int id) {
    this.id = id;
    System.out.printf("Headphone-%d Connected\n" , id);
}

public void receiveData(String data) {
    packetsReceived++;
    long timestamp = System.currentTimeMillis();
    System.out.println("  headphone-" + id + " received: " + data + " at time: " + timestamp + "ms");
}

public int getPacketsReceived() {
    return packetsReceived;
}
}