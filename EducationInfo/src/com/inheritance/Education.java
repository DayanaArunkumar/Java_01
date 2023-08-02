package com.inheritance;

public class Education { // base class for hierarchical
	public void ug() {
		System.out.println("UG programs are B.E, B.SC,B.COM");
	}
	public void pg() {
		System.out.println("PG programs are M.E, M.SC,M.COM");
		System.out.println();
	}
	public static void main(String[] args) {
		Education e =new Education();
		e.ug();
		e.pg();	
	}
}

