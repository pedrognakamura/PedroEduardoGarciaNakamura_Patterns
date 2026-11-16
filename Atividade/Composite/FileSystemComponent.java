public interface FileSystemComponent {

    String getName();

    long getSize();

    void display(String indentation);

    void add(FileSystemComponent component);

    void remove(FileSystemComponent component);

    static String formatarTamanho(long bytes) {
        double mb = bytes / (1024.0 * 1024.0);
        return String.format("%.1f MB", mb).replace(",", ".");
    }
}
