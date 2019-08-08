package stuff;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    public String getVersionNumber() {
    	return versionNumber;
    }
    public void setVersionNumber(String x) {
    	this.versionNumber=x;
    }
    public int getBatteryPercentage() {
    	return batteryPercentage;
    }
    public void setBatteryPercentage(int x) {
    	this.batteryPercentage=x;
    }
    public String getCarrier() {
    	return carrier;
    }
    public void setCarrier(String x) {
    	this.carrier=x;
    }
    public String getRingTone() {
    	return ringTone;
    }
    public void setRingTone(String x) {
    	this.ringTone=x;
    }
    // getters and setters removed for brevity. Please implement them yourself
}
