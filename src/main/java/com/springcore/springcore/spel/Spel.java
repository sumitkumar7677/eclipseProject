package com.springcore.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	
public class Spel {
	@Value("#{3+3}")
	private int y;
	@Value("#{3+93}")
	private int x;
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
	@Override
	public String toString() {
		return "Spel [y=" + y + ", x=" + x + "]";
	}
	
}
