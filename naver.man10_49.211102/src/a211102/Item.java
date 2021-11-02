package a211102;

public class Item {
	private int itemid;
	private String itemname;
	private String description;
	private int price;
	private String pictureurl;
	
	public Item() {
	}

	public Item(int itemid, String itemname, String description, int price, String pictureurl) {
		this.itemid = itemid;
		this.itemname = itemname;
		this.description = description;
		this.price = price;
		this.pictureurl = pictureurl;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", description=" + description + ", price=" + price
				+ ", pictureurl=" + pictureurl + "]";
	}
	
	
	
	
}
