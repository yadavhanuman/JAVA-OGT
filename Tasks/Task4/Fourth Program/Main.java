public class Main {

    // Package: com.electronics

    public static class ElectronicDevice {
        String brand;
        String model;

        public ElectronicDevice(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public void powerOn() {
            System.out.println("Powering on the electronic device");
        }
    }

    public static class SmartDevice extends ElectronicDevice {
        public SmartDevice(String brand, String model) {
            super(brand, model);
        }

        public void connectToWiFi() {
            System.out.println("Connecting to WiFi");
        }
    }

    public static class SmartPhone extends SmartDevice {
        public SmartPhone(String brand, String model) {
            super(brand, model);
        }

        public void makeCall() {
            System.out.println("Making a call");
        }
    }

    // Package: com.test

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("BrandName", "Model123");
        
        myPhone.powerOn();
        myPhone.connectToWiFi();
        myPhone.makeCall();
    }
}
