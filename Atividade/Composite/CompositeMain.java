public class CompositeMain {

    public static void main(String[] args) {
        long mb = 1024 * 1024;

        Directory root = new Directory("root");
        Directory docs = new Directory("docs");
        Directory fotos = new Directory("fotos");
        Directory familia = new Directory("familia");

        docs.add(new File("projeto.pdf", 2 * mb));
        docs.add(new File("relatorio.docx", mb));

        familia.add(new File("casal.jpg", 2 * mb));
        familia.add(new File("filhos.jpg", mb));

        fotos.add(new File("vacacao.jpg", 3 * mb));
        fotos.add(familia);

        root.add(docs);
        root.add(fotos);
        root.add(new File("readme.txt", mb / 2));

        root.display("");

        System.out.println();
        System.out.println("Tamanho total: " + FileSystemComponent.formatarTamanho(root.getSize()));
        System.out.println("Tamanho da pasta 'docs': " + FileSystemComponent.formatarTamanho(docs.getSize()));
        System.out.println("Tamanho da pasta 'familia': " + FileSystemComponent.formatarTamanho(familia.getSize()));
    }
}
