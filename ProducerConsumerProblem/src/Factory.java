
public class Factory {
	int num;
	boolean flag = false;
synchronized void produce(int num)  {
	if(!flag) {
	this.num = num;
	System.out.println("Produced item: "+num);
	flag = true;
	notify();
	}else {
		try {
			wait();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
synchronized void consume(int num) {
	if(flag) {
	this.num = num;
	System.out.println("Consumed item: "+num);
	flag = false;
	notify();
	}else {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
