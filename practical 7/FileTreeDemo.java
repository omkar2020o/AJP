import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.io.File;

public class FileTreeDemo extends JFrame {
    private JTree fileTree;

    public FileTreeDemo() {
        setTitle("File Tree Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        File root = new File("/");
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(root.getName());
        populateNode(rootNode, root);

        fileTree = new JTree(rootNode);

        JScrollPane scrollPane = new JScrollPane(fileTree);
        add(scrollPane);

        setLocationRelativeTo(null);
    }

    private void populateNode(DefaultMutableTreeNode parentNode, File parentFile) {
        File[] files = parentFile.listFiles();
        if (files != null) {
            for (File file : files) {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());
                parentNode.add(node);
                if (file.isDirectory()) {
                    populateNode(node, file);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FileTreeDemo app = new FileTreeDemo();
            app.setVisible(true);
        });
    }
}
