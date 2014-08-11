package com.epam.egor_balanovich.java.lecture1.task6.notes;

/**
 * Class contains note's information
 * @author Egor_Balanovich
 *
 */
public class Note {

	private int id;
	private String note="";
	
	public Note(){
		
	}
	/**
	 * 
	 * @param id number of note
	 * @param note text
	 */
	public Note(int id, String note){
		this.id=id;
		this.note=note;
	}
	/**
	 * 
	 * @return text of note
	 */
	public String getNote(){
		return note;
	}
	/**
	 * Method for create note text
	 * @param note text of note
	 */
	public void setNote(String note){
		this.note=note;
	}
	/**
	 * 
	 * @return number of note
	 */
	public int getId(){
		return id;
	}
	/**
	 * Method for create note id
	 * @param id number of note
	 */
	public void setId(int id){
		this.id=id;
	}
}
