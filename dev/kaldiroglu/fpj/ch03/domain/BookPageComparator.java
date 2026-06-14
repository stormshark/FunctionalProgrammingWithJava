package dev.kaldiroglu.fpj.ch03.domain;

import java.util.Comparator;

public class BookPageComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if (book1.getPages() < book2.getPages())
			return -1;
		else if (book1.getPages() > book2.getPages())
			return 1;
		else
			return 0;
	}
}
