import java.util.LinkedHashMap;
import java.util.Scanner;
public class Management_HashMap {
    public static void main(String[] args) throws Exception {
        LinkedHashMap<Integer, Product> productList = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        //Start up window
        System.out.print("Welcome to your inventory! \n What would you like to do?");
        System.out.print("1. View products \n 2. Add product \n 3. Remove product \n 4. Edit product \n 5. Search product \n 6. Filter products \n 7. Exit");
        switch (userInput) {
            case 1:
                for (Product product:productList) {
                    System.out.println(product.getKey() + " " + product.getValue().getName() + " " + product.getValue().getStock() + " " + product.getValue().getMinStock());
                }

            case 2:
                System.out.println("Enter product name: ");
                String addName = scanner.nextLine();
                System.out.println("Enter product stock: ");
                int addStock = scanner.nextInt();
                System.out.println("Enter product minimum stock: ");
                int addMinStock = scanner.nextInt();
                Product addProduct = new Product(addName, addStock, addMinStock);
                if (!productList.isEmpty()) {
                    productList.put(productList.lastEntry().getKey() + 1, addProduct);
                } else {
                    productList.put(1, addProduct);
                }
            case 3:
                System.out.println("Enter product name: ");
                String removeName = scanner.nextLine();
                System.out.println("Removing product " + removeName + ". Are you sure? (y/n)");
                String removeConfirm = scanner.nextLine();
                if (removeConfirm == "y") {
                    productList.remove(product);
                }
            case 4:
                for (Product product:productList) {
                    System.out.println(product.getKey() + " " + product.getValue().getName() + " " + product.getValue().getStock() + " " + product.getValue().getMinStock());
                }
                System.out.println("Enter the ID to be edited.")
                int selectedID = scanner.nextInt();
                System.out.println("ID: " + selectedID + "\n Name: " + productList.get(selectedID).getName() + "\n Stock: " + productList.get(selectedID).getStock() + "\n Min stock: " + productList.get(selectedID).getMinStock());
                System.out.println("Which do you want to edit? \n 1. Name \n 2. Stock \n 3. Minimum stock")

            case 5:
                System.out.println("Enter product name: ");
                String searchName = scanner.nextLine();
                for (Product product:productList) {
                    if (product.getName() == searchName) {
                        System.out.println(searchName.getKey() + " " + searchName.getValue().getName() + " " + searchName.getValue().getStock() + " " + searchName.getValue().getMinStock())
                    }
                }
            case 6:
                System.out.println("Filter by: \n 1. Expiry date \n 2. Newest to oldest \n 3. Oldest to newest");
                Scanner sc = new Scanner(System.in);
                int filterInput = sc.nextInt();
                switch (filterInput) {
                    case 1:
                    case 2:
                    case 3:
                    default:
                        System.out.println("Invalid input.");
                }
            case 7:
            default: throw new Exception("Invalid input");
        }
    }
}