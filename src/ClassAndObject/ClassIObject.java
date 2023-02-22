package ClassAndObject;

public class ClassIObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setColor("Red");
        car1.setReleased(1992);
        System.out.println(car1.getModel() + " " + car1.getColor() + " " + car1.getReleased());
    }

    static class Car {
        private String model;
        private String color;
        private int released;

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setReleased(int released) {
            this.released = released;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getReleased() {
            return released;
        }
    }
}
