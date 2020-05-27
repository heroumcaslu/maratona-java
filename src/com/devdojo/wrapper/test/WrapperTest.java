package com.devdojo.wrapper.test;

public class WrapperTest {
	
	byte primitivoByte = 1;
	short primitivoShort = 1;
	//Numeros literais inteiros escritos no código são considerados int embora caibam em um long
	int primitivoInt = 1;
	long primitivoLong = 1;
	//Numeros literais decimais escritios no código são considerados double.
	float primitivoFloat = 1;
	double primitivoDouble = 1;
	char primitivoChar = 'a';
	boolean primitivoBool = false;
	
	//Wrappers, trabalhamos com objetos que funcionam com herança e polimorfismo.
	Byte primByte = primitivoByte;
	Short primShort = primitivoShort;
	Integer primInteger = primitivoInt;
	Long primLong = primitivoLong;
	Float primFloat = primitivoFloat;
	Double primDouble = primitivoDouble;
	Character primCharacter = primitivoChar;
	Boolean primBoolean = primitivoBool;
	
	//Boxing, unboxing e autoboxin.
	
	//Autoboxing (int vira Byte)
	Byte byteValue = 1;
	//Unboxing (Integer vira int)
	int i = primInteger;
	
	int value = Integer.valueOf(i);
	
	char digit = 'a';
	
	boolean chart = Character.isDigit(digit);
	

}
