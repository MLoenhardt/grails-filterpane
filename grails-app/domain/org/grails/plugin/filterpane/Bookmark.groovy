package org.grails.plugin.filterpane
class Bookmark {

	Book book
	int page
	Date dateCreated
	
    static constraints = {
		book()
		page()
		dateCreated()
    }
	
	static mapping = {
		sort "page"
	}
}
