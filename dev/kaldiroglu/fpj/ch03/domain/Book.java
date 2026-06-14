package dev.kaldiroglu.fpj.ch03.domain;

public class Book implements Comparable {
	private String title;
	private String authorFName;
	private String authorLName;
	private int pages;
	
	public Book() {
		this.title = "No title specified!";
		this.authorFName = "No author first name specified!";
		this.authorLName = "No author last name specified!";
		this.pages = 0;
	}

	public Book(String title, String authorFName, String authorLName, int pages) {
		this.title = title;
		this.authorFName = authorFName;
		this.authorLName = authorLName;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFName() {
		return authorFName;
	}

	public void setAuthorFName(String authorFName) {
		this.authorFName = authorFName;
	}

	public String getAuthorLName() {
		return authorLName;
	}

	public void setAuthorLName(String authorLName) {
		this.authorLName = authorLName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String toString() {
		return getTitle() + " (" + pages + " pages) " + " Written By: " + getAuthorFName() + " " + getAuthorLName() + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorFName == null) ? 0 : authorFName.hashCode());
		result = prime * result + ((authorLName == null) ? 0 : authorLName.hashCode());
		result = prime * result + pages;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorFName == null) {
			if (other.authorFName != null)
				return false;
		} else if (!authorFName.equals(other.authorFName))
			return false;
		if (authorLName == null) {
			if (other.authorLName != null)
				return false;
		} else if (!authorLName.equals(other.authorLName))
			return false;
		if (pages != other.pages)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		Book book = (Book) o;
		return title.compareTo(book.getTitle());
	}

	public void printInfo() {
		System.out.println(" *** Book Info *** ");
		System.out.println(this);
	}
}
