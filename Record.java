package cs21as04;

// abstract base class or interface for data 
public class Record {
	private int id;

	public Record() {
		id = 0;
	}
	
	public Record(int n) {
		id = n;
	}
	
	public int getID() {
		return id;
	} // or something similar
	
	public void setID(int n) {
		id = n;
	}
	
  // anything else that you think is appropriate
}