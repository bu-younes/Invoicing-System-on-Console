package src;

import java.io.Serializable;
import java.util.ArrayList;

public class Shop implements Serializable {
    private String shopName;
    private String invoiceHeader;
    private String tel;
    private String fax;
    private String email;
    private String website;
    private ArrayList<Item> items;

    public Shop() {
        items = new ArrayList<Item>();
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setInvoiceHeader(String tel, String fax, String email, String website) {
        this.tel = tel;
        this.fax = fax;
        this.email = email;
        this.website = website;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

    public void changeItemPrice(Item item, double price) {
        item.setUnitPrice(price);
    }

    public void reportAllItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}