package src;

public class Item {
	int itemId;
    String itemName;
    double unitPrice;
    int quantity;
    double qtyAmount;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getQtyAmount() {
		return qtyAmount;
	}
	public void setQtyAmount(double qtyAmount) {
		this.qtyAmount = qtyAmount;
	}

}
