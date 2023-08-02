package com.inheritance;

public class Arts extends Education{// Hierarchical
	public void bsc() {
		System.out.println("bsc programs are in CSE, Maths, Che, English");
	}
	public void bEd() {
		System.out.println("bEd programs are teacher training");
	}
	public void bA() {
		System.out.println("bA programs are in Economics, literature");
	}
	public static void main(String[] args) {
		Arts a =new Arts();
		a.bsc();
		a.bEd();
		a.bA();
		a.ug();
		a.pg();
}
}
