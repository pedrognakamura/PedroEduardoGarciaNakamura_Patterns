import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long total = 0;
        for (FileSystemComponent c : components) {
            total += c.getSize();
        }
        return total;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name + "/");

        String prefixoFilhos = "";
        if (!indentation.isEmpty()) {
            prefixoFilhos = indentation.substring(0, indentation.length() - 3);
            if (indentation.endsWith("├─ ")) {
                prefixoFilhos += "│  ";
            } else {
                prefixoFilhos += "   ";
            }
        }

        for (int i = 0; i < components.size(); i++) {
            if (i == components.size() - 1) {
                components.get(i).display(prefixoFilhos + "└─ ");
            } else {
                components.get(i).display(prefixoFilhos + "├─ ");
            }
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
}
