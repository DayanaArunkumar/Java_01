package com.inheritance;

public class Medicine extends Engineering{// Mutlilevel Inheritance
	public void physio() {
		System.out.println("Physio is BPT");
	}
	public void dental() {
		System.out.println("dental is BDS ");
	}
	public void mbbs() {
		System.out.println("mbbs is doctor");
	}
	public static void main(String[] args) {
		Medicine m =new Medicine();
		m.physio();
		m.dental();
		m.mbbs();
		m.ug();
		m.pg();
		m.bE();
		m.bTech();
	}
}
