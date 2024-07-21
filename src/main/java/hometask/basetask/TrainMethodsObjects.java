package main.java.hometask.basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println("возраст: " + mouse.getMouseAge());
        System.out.println("имя: " + mouse.getMouseName());
        mouse.printMouseDetails();
    }

    public void processSauce(Sauce sauce) {
        System.out.println("соус: " + sauce.getSauceName());
        System.out.println("цвет: " + sauce.getSauceColor());
        sauce.printSauceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println("вид: " + bee.getGender());
        System.out.println("вес: " + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("препядствие: " + obstacle.getDescriptionObstacle());
        System.out.println("северити: " + obstacle.getSeverityObstacle());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println("объект для сравнения: " + pineapple.getGrade());
        System.out.println("теплоёмкость: " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
