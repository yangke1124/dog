package com.example.demo.bean;

public class Goods {

	private int gid;// 编号
	private String gname;// 名称
	private double price;// 价格
	private String getCount;// 百分比

	public Goods() {// 无参
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int gid, String gname, double price, String getCount) {// 有参
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.getCount = getCount;
	}

	public int getGid() {// 封装
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
	public String toString() {// tostring重写
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", getCount=" + getCount + "]";
	}

}
