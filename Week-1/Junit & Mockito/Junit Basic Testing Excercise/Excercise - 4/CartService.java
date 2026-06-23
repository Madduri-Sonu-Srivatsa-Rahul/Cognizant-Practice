package JunitExcercise4;

import java.util.ArrayList;

public class CartService {
    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void clearCart() {
        items.clear();
    }
}
