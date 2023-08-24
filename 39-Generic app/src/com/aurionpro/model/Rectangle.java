package com.aurionpro.model;

public class Rectangle<T> {
	    private T width;
	    private T height;

	    public Rectangle(T width, T height) {
	        this.width = width;
	        this.height = height;
	    }

	    public T getWidth() {
	        return width;
	    }

	    public T getHeight() {
	        return height;
	    }

	}
