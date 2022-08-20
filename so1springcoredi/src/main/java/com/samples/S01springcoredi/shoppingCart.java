package com.samples.S01springcoredi;

public class shoppingCart {
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "shoppingCart [item=" + item + "]";
	}
	

}
