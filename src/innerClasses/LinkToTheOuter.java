package innerClasses;
// every inner class has implicit link to the enclosing object without any special qualifications

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class LinkToTheOuter {
	private Object[] items;
	private int next = 0;
	public LinkToTheOuter(int size) {
		items = new Object[size];
	}
	
	public void add(Object x) {
		if(next < items.length) {
			items[next++] = x;
		}
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		
		@Override
		public boolean end() {
			return i == items.length;	// reference to the outer class member
		}
		
		@Override
		public Object current() {
			return items[i];
		}
		
		@Override
		public void next() {
			if (i < items.length) 
				i++;
		}
		public LinkToTheOuter outer() {
			return LinkToTheOuter.this;	// returning an outer class
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		LinkToTheOuter sequence = new LinkToTheOuter(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		
		LinkToTheOuter link = new LinkToTheOuter(0);
		LinkToTheOuter.SequenceSelector seqSelector = link.new SequenceSelector();	// getting reference to the inner class using .new
	}
}
