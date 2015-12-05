package com.design23.com;

import java.util.LinkedList;

import com.design23.com.builder.Person;
import com.design23.com.builder.Person.Gender;
import com.design23.com.single.SingleInstanceDCL;

/**
 * @Name:
 * @author KingJA
 * @date 2015-11-15 下午2:35:45
 * @version V1.0
 * @Description:
 */
public class Main {
	public static void main(String[] args) {
//		testByPosition(1);
	}

	public static void testByPosition(int position) {
		switch (position) {
		// 单例模式
		case 1:
			mSingleInstanceTest();
			break;
		// 建造者模式
		case 2:
			mBuilderTest();
			break;

		default:
			break;
		}
	}

	/**
	 * 1.单例模式
	 */
	private static void mSingleInstanceTest() {
		SingleInstanceDCL instanceA = SingleInstanceDCL.getInstance();
		SingleInstanceDCL instanceB = SingleInstanceDCL.getInstance();
		System.out.println("instanceA="+instanceA.toString());
		System.out.println("instanceB="+instanceB.toString());

	}

	/**
	 * 2.建造者模式
	 */
	private static void mBuilderTest() {
		Person.Builder builder = new Person.Builder();
		Person person = builder.setAge(18).setName("Genius").setGender(Gender.MAN)
				.create();
		System.out.println(person.toString());
	}

}
