package main.java.hometask.basetask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        Mouse mouse = new Mouse("Сверх тяжелый немецкий танк Mouse", 79);
        Sauce sauce = new Sauce("чесночный", "белый");
        Bee bee = new Bee("пчела", 10);
        Obstacle obstacle = new Obstacle("бобэр курва", "критикал");
        Pineapple pineapple = new Pineapple("ананас", 10);
        trainMethodsObjects.processMouse(mouse);
        System.out.println();
        trainMethodsObjects.processSauce(sauce);
        System.out.println();
        trainMethodsObjects.processBee(bee);
        System.out.println();
        trainMethodsObjects.processObstacle(obstacle);
        System.out.println();
        trainMethodsObjects.processPineapple(pineapple);
    }
}
