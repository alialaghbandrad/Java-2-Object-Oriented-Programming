package polyexample;

//Tree and Plant

class Plant{
	
//	public Plant() {
//		System.out.println("Plant is generated");
//	}
	
	public void grow() {
		System.out.println("plant growing");
	}
}

class Tree extends Plant{
	
//	public Tree() {
//		System.out.println("Tree is generated");
//	}
	
	@Override
	public void grow() {
		System.out.println("Tree growing");
	}
	
	public void shedLeaves() {
		System.out.println("Leaves Shedding");
	}
}

public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant(); // Reference to Plant and you make an object of Plant
	
		//when you instantiate the child , first the constructor of parent is being called
		Tree tree = new Tree();
		
		//because of polymorphism
		//we can use the child class whenever the parent class is expected
		Plant plant2 = tree;
		
		//PARENT OBJECT JUST REFERENCES THE CHILDREN 
		//plant2 references a tree. so the Tree grow() method is called
		plant2.grow();
		
		tree.shedLeaves();
		
//		plant2.shedLeaves(); => this does not work
		
		doGrow(tree);
		//doGrow(cactus);
		//doGrow(flower)
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	
}
