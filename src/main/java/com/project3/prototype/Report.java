package com.project3.prototype;

public interface Report extends Cloneable
{
	Report clone();
	void generate(String data);
}