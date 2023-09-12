import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeComponentDemo extends JFrame {
    private JTree tree;

    public TreeComponentDemo() {
        setTitle("Tree Component Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode parent1 = new DefaultMutableTreeNode("Parent 1");
        DefaultMutableTreeNode parent2 = new DefaultMutableTreeNode("Parent 2");

        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("Child 3");

        parent1.add(child1);
        parent1.add(child2);
        parent2.add(child3);

        rootNode.add(parent1);
        rootNode.add(parent2);

        tree = new JTree(rootNode);

        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TreeComponentDemo app = new TreeComponentDemo();
            app.setVisible(true);
        });
    }
}
