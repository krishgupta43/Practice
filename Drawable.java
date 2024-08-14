package Practice;

interface Drawable {
	void draw();
}

//Implementation: by second user  
class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}

class TestInterface1 {
//Drawable d; 
//d.draw();
}

