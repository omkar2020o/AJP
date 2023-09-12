import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeComponentDemom extends JFrame {
    private JTree tree;

    public TreeComponentDemom() {
        setTitle("Tree Component Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode parent1 = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode parent2 = new DefaultMutableTreeNode("Gujrath");

        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode child4 = new DefaultMutableTreeNode("Nagpur");

        parent1.add(child1);
        parent1.add(child2);
        parent1.add(child3);
        parent1.add(child4);

        rootNode.add(parent1);
        rootNode.add(parent2);

        tree = new JTree(rootNode);

        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TreeComponentDemom app = new TreeComponentDemom();
            app.setVisible(true);
        });
    }
}
