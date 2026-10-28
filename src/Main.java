import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(new Electronic("E1", "Laptop", 55000, 5, 24));
        itemsList1.add(new Electronic("E2", "Mobile Phone", 22000, 8, 12));
        itemsList1.add(new Electronic("E3", "Earphones", 1500, 0, 6));
        itemsList1.add(new Book("B1", "Java", 799, 10, "James Gosling"));
        itemsList1.add(new Clothing("C1", "T-Shirt", 499, 20, "M"));

        // 1a. Print all item IDs
//        itemsList1.stream().map(x -> x.getId())
//                .forEach(x -> {
//            System.out.println(x);
//        });

        // 1b. List of item names, lowercase
        // HW

        // 2a. Items priced above 1000 — print names
        itemsList1
                .stream()
                .filter(x -> x.getPrice() > 1000)
                .forEach(x -> System.out.println(x.getName()));


        // 2b. Is any item out of stock?
        boolean outOfStock = itemsList1
                .stream()
                .anyMatch(x -> x.getQuantity() == 0);

        // 2c. Confirm no item has a negative quantity
        boolean everythingFine = itemsList1.stream().anyMatch(x -> x.getQuantity() < 0);
        System.out.println(everythingFine);
        // 2d. How many items are priced above 1000?

        // 3. In a single stream pipeline: filter items priced above 1000 and in stock, get just their names,
        // remove duplicates, sort alphabetically, keep only the top 5.

        // 4a. Total quantity of all items
        int sum = itemsList1
                .stream()
                .map(x -> x.getQuantity())
                .reduce(0, (curr_sum, ele) -> curr_sum + ele);

        System.out.println(sum);

        // 4b. Most expensive item -> use reducer
        // 4c. Concatenate item names, comma-separated -> use reduce

    }
}