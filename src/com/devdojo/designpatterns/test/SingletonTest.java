package com.devdojo.designpatterns.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.devdojo.designpatterns.Airplane;
import com.devdojo.designpatterns.SingletonAirplane;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agendarAssento("1A");
		agendarAssento("1B");
		SingletonAirplane singletonAirplane = SingletonAirplane.getInstance();
		SingletonAirplane singletonAirplane2 = null;
		Constructor[] constructors = SingletonAirplane.class.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			
			constructor.setAccessible(true);
			try {
				singletonAirplane2 = (SingletonAirplane) constructor.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		}
		System.out.println(singletonAirplane.hashCode());
		System.out.println(singletonAirplane2.hashCode());

	}

	private static void agendarAssento(String assento) {

		SingletonAirplane a = SingletonAirplane.getInstance();
		a.bookAssento(assento);

	}

}
