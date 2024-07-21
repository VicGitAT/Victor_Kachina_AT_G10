package main.java.hometask.basetask;

public class Obstacle {

    private String descriptionObstacle;
    private String severityObstacle;

    public Obstacle(String descriptionObstacle, String severityObstacle) {
        this.descriptionObstacle = descriptionObstacle;
        this.severityObstacle = severityObstacle;
    }

    public String getDescriptionObstacle() {
        return descriptionObstacle;
    }

    public void setDescriptionObstacle(String descriptionObstacle) {
        this.descriptionObstacle = descriptionObstacle;
    }

    public String getSeverityObstacle() {
        return severityObstacle;
    }

    public void setSeverityObstacle(String severityObstacle) {
        this.severityObstacle = severityObstacle;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + severityObstacle + " препядствие " + descriptionObstacle);
    }
}
