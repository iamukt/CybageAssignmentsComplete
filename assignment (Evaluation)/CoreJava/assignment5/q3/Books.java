/**
 * @author Umesh Kumar Toke
 * Problem Name: HashMap for books
 * Role of this File: 
 */
package org.cybage.assignments.assignment5.q3;
import java.util.Comparator;

public class Books implements Comparator<Books>{
	private long isbn;
	
	private String bookName;
	private int nop;
	/**
	 * 
	 */
	public Books() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param isbn
	 * @param bookName
	 * @param nop
	 */
	public Books(long isbn, String bookName, int nop) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.nop = nop;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (isbn ^ (isbn >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Books o1, Books o2) {
		// TODO Auto-generated method stub
		return ((Long)o1.isbn).compareTo(o2.isbn);
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", bookName=" + bookName + ", nop=" + nop + "]";
	}
	

}
