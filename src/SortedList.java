/**
 * 
 * @author G0161
 *@version 6.0.2
 *
 */
public class SortedList extends IntegerList{
	
	public SortedList() {
		super();
	}
	public SortedList(int capacity) {
		super(capacity);
	}
	public void add(int integer) {
		if(super.size() == 0)
			super.add(integer);
		else {
			int minIdx = 0;
			for(int i = 0; i < super.size(); i++) 
				if(super.get(i) < integer)
					minIdx = i+1;
			super.insert(minIdx, integer);
		}
	}
	public void insert(int index, int integer) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
}
