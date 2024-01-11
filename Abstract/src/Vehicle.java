
public interface Vehicle {
 void stop();
 void start();
 void playmusic();
 
}

class BMW implements Vehicle{
	 public void stop() {
		 System.out.println(" BMW Stops");
	 }
	 public void start() {
		 System.out.println("BMW Start");
	 }
	 public void playmusic() {
		 System.out.println("Playing music");
	 }
}


