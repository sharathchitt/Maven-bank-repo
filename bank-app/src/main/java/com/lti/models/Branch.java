package com.lti.models;

public class Branch {
	
	int branchID;
	String branchName;
	static String branchManager="Jim Halpert";
	
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public static String getBranchManager() {
		return branchManager;
	}
	public static void setBranchManager(String branchManager) {
		Branch.branchManager = branchManager;
	}
	
	

}
