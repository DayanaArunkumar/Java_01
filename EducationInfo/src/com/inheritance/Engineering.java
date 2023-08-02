package com.inheritance;

public class Engineering extends Education{ // hierarchical inheritance
	public void bE() {
		System.out.println("bE programs are in CSE,ECE,EEE,MECH,");
	}
	public void bTech() {
		System.out.println("bTech programs are in IT,AIDS, ML");
	}
	public static void main(String[] args) {
		Engineering eg =new Engineering();
		eg.bE();
		eg.bTech();
		eg.ug();
		eg.pg();
	}
}
