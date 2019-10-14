package com.example.demo.bean;

public class Goods {

	private int gid;
	private String gname;
	private double price;
	private String getCount;

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int gid, String gname, double price, String getCount) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.getCount = getCount;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGetCount() {
		return getCount;
	}

	public void setGetCount(String getCount) {
		this.getCount = getCount;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", getCount=" + getCount + "]";
	}

}
