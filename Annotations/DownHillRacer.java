package Annotations;

import Annotations.CustomAnnotation.BikerStats;

// @CustomAnnotation2(5)
@BikerStats(name = "Bobby Billy Brown", state = "Wyoming", skillLevel = 3, bikeType = "Specialized")
public class DownHillRacer {

    public static void main(String[] args) {
        DownHillRacer racer1 = new DownHillRacer();

        BikerStats stats = racer1.getClass().getAnnotation(BikerStats.class);

        System.out.println("Name: " + stats.name());
        System.out.println("State: " + stats.state());
        System.out.println("Skill Level: " + stats.skillLevel());
        System.out.println("Bike Type: " + stats.bikeType());
        System.out.println("Team Name: " + stats.teamname());

    }
}
