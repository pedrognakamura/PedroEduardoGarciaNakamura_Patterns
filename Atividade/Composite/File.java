public class File implements FileSystemComponent {

    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name + " (" + FileSystemComponent.formatarTamanho(size) + ")");
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes");
    }
}
