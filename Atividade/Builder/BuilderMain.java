public class BuilderMain {

    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
                .setProcessador("Intel Core i5")
                .setMemoriaRam("8GB")
                .setArmazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .setProcessador("Intel Core i9")
                .setMemoriaRam("32GB")
                .setArmazenamento("1TB SSD")
                .setPlacaDeVideo("NVIDIA RTX 4070")
                .build();

        System.out.println("=== Computador Básico ===");
        System.out.println(basico);

        System.out.println();
        System.out.println("=== Computador Gamer ===");
        System.out.println(gamer);
    }
}
