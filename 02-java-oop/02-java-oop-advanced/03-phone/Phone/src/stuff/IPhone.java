package stuff;

public class IPhone extends Phone implements Ringable{
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	return "iPhone " + getVersionNumber() + " " + getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        // your code here            
    	System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());
    }
}
