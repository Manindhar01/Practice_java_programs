package com.emc.Test;

import java.util.Scanner;

import com.emc.entity.Event;
import com.emc.entity.Organizer;
import com.emc.entity.Participant;
import com.emc.entity.Venue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organizer obj=new Organizer();
		obj.id=123l;
		obj.name="Apple inc";
		System.out.println(obj);
		System.out.println(obj.id);
		System.out.println(obj.name);
		
		System.out.println();
		
		Event obj1=new Event(333,"Launch apple 14","Grand Launch","10:00am", "3:00pm", true);
		System.out.println(obj1.id);
		System.out.println(obj.name);
		
		Venue obj2=new Venue(444,"Apple launch", null,"veenu street","chennai", "Tamilnadu","India", 234567);
		System.out.println(obj2.id);
		System.out.println(obj2.city);
		System.out.println(obj2.country);
		
		System.out.println();
		
		System.out.println("Enter participant details");
		Scanner s=new Scanner(System.in);
		System.out.print("enter id:");
		long a=s.nextLong();
		System.out.println(a);
		System.out.print("enter name:");
		String b=s.next();
		System.out.println(b);
		System.out.println("enter email:");
		String c=s.next();
		System.out.println(c);
		System.out.println("conform:");
		boolean d=s.nextBoolean();
		System.out.println(d);
		
		Participant obj3=new Participant(a, b, c, d);
		

	}

}
