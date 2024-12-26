package net.aerh;

public class Main {
    public static void main(String[] args) {

        // Create a Bird using the builder
        Bird bird = new Bird.Builder()
                .withSpecies("Parrot")
                .withWeight(500)
                .withWingspan(50)
                .withBeak(BeakType.SHARP)
                .build();

        System.out.println("Animal class: " + bird.getClass().getName());
        System.out.println("Bird Species: " + bird.getSpecies());
        System.out.println("Bird Weight: " + bird.getWeight());
        System.out.println("Bird Wingspan: " + bird.getWingspan());
        System.out.println("Bird Beak Type: " + bird.getBeak());

        // Eat food
        Food food = new Food(100);
        bird.eatFood(food);
    }
}
