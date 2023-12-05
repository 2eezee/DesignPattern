package board.iterator;

import board.bean.Board;

interface BoardIterator {
	
	public abstract boolean hasNext();
	
	public abstract Object next();

}