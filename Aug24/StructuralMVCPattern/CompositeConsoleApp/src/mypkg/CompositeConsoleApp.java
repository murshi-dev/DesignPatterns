package mypkg;

import java.util.ArrayList;

abstract class Graphic {
	public String name;
	public abstract void display();
};

class Leaf extends Graphic {
	public Leaf(String name)
	{
		this.name=name;
	}

	public void display()
	{
		System.out.println("Name is " + name);
	}
};

class Group extends Graphic {
	public ArrayList<Graphic> leaves = new ArrayList<Graphic>();

	public Group(String name)
	{
		this.name=name;
	}

	public void add(Graphic leaf)
	{
		leaves.add(leaf);
	}

	public void display() {
		for(Graphic g : leaves)
			g.display();
	}
};


public class CompositeConsoleApp {
    Group root;
    
	public static void main(String[] args) {
		new CompositeConsoleApp();
	}
	
	public CompositeConsoleApp()
	{
        System.out.println("Hello from composite example");
        root = new Group("scene");
        Group polygons = new Group("polygons");
        Leaf triangle = new Leaf("triangle");
        Group other = new Group("other");
        Leaf circle = new Leaf("circle");
        
        root.add(polygons);
        root.add(other);
        polygons.add(triangle);
        other.add(circle);
        
        renderScene();
	}
	
    void renderScene()
    {
        root.display();
    }
}


