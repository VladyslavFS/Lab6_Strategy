class ImageRenderer {
    private RenderingStrategy strategy;

    public void setStrategy(RenderingStrategy strategy) {
        this.strategy = strategy;
    }

    public void render() {
        if (strategy == null) {
            System.out.println("No rendering strategy set!");
        } else {
            strategy.render();
        }
    }
}
