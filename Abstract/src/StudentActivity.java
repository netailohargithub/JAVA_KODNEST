
public interface StudentActivity {
 void study();
 void sleep();
 void eat();
 void play();
 void move();
}

class CivilStudent implements StudentActivity{

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Studying");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Moving");
	}
	
}

class AgriStudent implements StudentActivity{

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Agri student Studying");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Agri student Sleeping");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Agri student Eating");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Agri student Playing");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Agri student 	``Moving");
	}
}

