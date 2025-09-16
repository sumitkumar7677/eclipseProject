package com.springcore.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	
public class Spel {
	@Value("#{3+3}")
	private int y;
	@Value("#{3+93}")
	private int x;
	
	@Value("#{T(java.lang.Math).sqrt(23)}")
	private double z;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Spel [y=" + y + ", x=" + x + ", z=" + z + "]";
	}
	
	
}
