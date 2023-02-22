package restaurant;

import java.util.ArrayList;
import java.util.List;

//MENYU
public class Menu {
    private List<Category> categories = new ArrayList<>();
    private List<MenuItem> menuItems = new ArrayList<>();

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


}
