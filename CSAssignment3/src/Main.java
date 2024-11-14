import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        DataLoader.loadData("amazon-product-data.csv", tree);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product IDs to search, separate them with a comma: ");
        String [] searchIds = scanner.nextLine().split(", ");
        String[] insertIDs = {"1bc287229e08f42b571719d876fd9390", "c4516bf26345dc3de65d173bfdc3416z"};
        for (String productId : searchIds) {
            Product searchResult = tree.search(productId);
            if (searchResult != null) {
                System.out.println("Product information: " + searchResult);
            } else {
                System.out.println("Product ID " + productId + " not found.");
            }
        }
        for (String productId : insertIDs) {
            Product insertResult = tree.search(productId);
            if (insertResult != null) {
                System.err.println("A product with ID " + productId + " already exists.");
            }
            else {
                System.out.println("Inserting a new product with ID " + productId);
            }
        }
    }
}