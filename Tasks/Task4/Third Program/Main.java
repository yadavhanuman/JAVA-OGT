public class Main {
    
    // Package: com.media

    public static class Media {
        public void displayInfo() {
            System.out.println("Generic media info");
        }
    }

    public static class Book extends Media {
        @Override
        public void displayInfo() {
            System.out.println("Book information");
        }
    }

    public static class CD extends Media {
        @Override
        public void displayInfo() {
            System.out.println("CD information");
        }
    }

    public static class DVD extends Media {
        @Override
        public void displayInfo() {
            System.out.println("DVD information");
        }
    }
    
    // Package: com.test

    public static void main(String[] args) {
        Media[] mediaArray = new Media[3];
        mediaArray[0] = new Book();
        mediaArray[1] = new CD();
        mediaArray[2] = new DVD();
        
        for (Media media : mediaArray) {
            media.displayInfo();
        }
    }
}
