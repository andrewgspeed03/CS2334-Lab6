/**
 * 
 * @author G0161
 *@version 6.0.3
 *
 */
public class RangeList extends IntegerList {
	
	public RangeList() {
		super();
	}
	public RangeList(int lowerBound, int upperBound) throws IllegalArgumentException{
		super();
		if(lowerBound > upperBound)
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		else
			for(int i = lowerBound; i <= upperBound; i++)
				super.add(i);
	}
	public void add(int lowerBound, int upperBound) throws IllegalArgumentException{
		if(lowerBound > upperBound)
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		if(super.size() == 0)
			for(int i = lowerBound; i <= upperBound; i++)
				super.add(i);
		if(super.get(0) > lowerBound) 
			for(int i = super.get(0); i > lowerBound; i--)
				super.insert(0, i-1);
		if(super.get(super.size()-1) < upperBound)
			for(int i = super.get(super.size()-1); i < upperBound; i++) 
				super.add(i+1);;
	}
	public void remove(int lowerBound, int upperBound) throws IllegalArgumentException, UnsupportedOperationException{
		if(lowerBound > upperBound)
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		else if(super.size() == 0)
			throw new UnsupportedOperationException("Cannot remove range from an empty list.");
		else if(super.get(super.size()-1) < upperBound || super.get(0) > lowerBound)
			throw new IllegalArgumentException("Lower and/or upper bounds are out of the current list range.");
		else if (super.get(0) != lowerBound && super.get(super.size()-1) != upperBound)
			throw new IllegalArgumentException("Cannot remove non-terminal ranges.");
		else
			for(int i = lowerBound; i <= upperBound; i++)
				super.remove(super.indexOf(i));
	}
	public void insert(int index, int integer) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	public void add(int interger) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
}
