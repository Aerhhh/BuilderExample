package net.aerh;

public class Bird extends Animal {

    private final int wingspan;
    private final BeakType beak;

    public Bird(String species, int weight, int wingspan, BeakType beak) {
        super(species, weight);
        this.wingspan = wingspan;
        this.beak = beak;
    }

    public int getWingspan() {
        return wingspan;
    }

    public BeakType getBeak() {
        return beak;
    }

    @Override
    public void eatFood(Food food) {
        super.eatFood(food);
        System.out.println("Bird-specific behavior when eating food");
    }

    public static class Builder extends Animal.Builder<Builder> {
        private int wingspan;
        private BeakType beak;

        public Builder withWingspan(int wingspan) {
            this.wingspan = wingspan;
            return this;
        }

        public Builder withBeak(BeakType beak) {
            this.beak = beak;
            return this;
        }

        @Override
        public Bird build() {
            return new Bird(species, weight, wingspan, beak);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

