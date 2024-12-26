package net.aerh;

public class Animal {

    private final String species;
    private final int weight;

    public Animal(String species, int weight) {
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public int getWeight() {
        return weight;
    }

    public void eatFood(Food food) {
        System.out.println("Animal is eating food with " + food.getCalories() + " calories");
    }

    public static class Builder<T extends Builder<T>> {
        protected String species;
        protected int weight;

        protected T self() {
            return (T) this;
        }

        public T withSpecies(String species) {
            this.species = species;
            return self();
        }

        public T withWeight(int weight) {
            this.weight = weight;
            return self();
        }

        public Animal build() {
            return new Animal(species, weight);
        }
    }
}

