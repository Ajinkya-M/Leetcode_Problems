package com.vmware.ds;

public class Account {
	Integer accNo;
	String type;
	String branch;
	public Account(Integer accNo, String type, String branch) {
		super();
		this.accNo = accNo;
		this.type = type;
		this.branch = branch;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", type=" + type + ", branch=" + branch + "]";
	}
	
}
