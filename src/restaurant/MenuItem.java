package restaurant;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 21/02/2023.
 */
public class MenuItem {
    private String name;
    private double price;
    private String description;
    private Category category;

    public MenuItem(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }


    // Create some categories and menu items
    Category appetizers = new Category("Appetizers");
    MenuItem mozzarellaSticks = new MenuItem("Mozzarella Sticks", 6.99, "Fried mozzarella cheese sticks with marinara sauce", appetizers);
    MenuItem garlicBread = new MenuItem("Garlic Bread", 4.99, "Toasted bread with garlic butter", appetizers);
    Category entrees = new Category("Entrees");
    MenuItem spaghetti = new MenuItem("Spaghetti", 10.99, "Spaghetti with meat sauce", entrees);
    MenuItem lasagna = new MenuItem("Lasagna", 12.99, "Lasagna with meat sauce", entrees);

    // Create the menu and add the categories and items
    Menu menu = new Menu();
//menu.addCategory(appetizers);
//menu.addCategory(entrees);
//menu.addMenuItem(mozzarellaSticks);
//menu.addMenuItem(garlicBread);
//menu.addMenuItem(spaghetti);
//menu.addMenuItem(lasagna);

//// Print out the menu
//for(
//    Category category :menu.getCategories())
//
//    {
//        for (MenuItem item : menu.getMenuItems()) {
//        System.out.println(category.getName() + ":");
//            if (item.getCategory() == category) {
//                System.out.println("- " + item.getName() + " - $" + item.getPrice());
//                System.out.println("  " + item.getDescription());
//            }
//        }
//        System.out.println();
//    }
}




