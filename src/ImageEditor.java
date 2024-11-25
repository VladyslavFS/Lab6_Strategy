public class ImageEditor {
    public static void main(String[] args) {
        ImageRenderer renderer = new ImageRenderer();

        System.out.println("Setting Basic Rendering Strategy...");
        renderer.setStrategy(new BasicRendering());
        renderer.render();

        System.out.println("\nSetting Filtered Rendering Strategy...");
        renderer.setStrategy(new FilteredRendering());
        renderer.render();

        System.out.println("\nSetting High-Quality Rendering Strategy...");
        renderer.setStrategy(new HighQualityRendering());
        renderer.render();
    }
}
