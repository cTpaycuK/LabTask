package com.epam.egor_balanovich.java.lecture1.task6.notes;

import java.util.ArrayList;
/**
 * Class contains information about all
 * notes in notebook
 * @author Egor_Balanovich
 *
 */
public class Notebook {

	private ArrayList<Note> note=new ArrayList<Note>();
	
	public Notebook(){
		
	}
	/**
	 * 
	 * @return all notes that contains in this notebook
	 */
	public ArrayList<Note> getNote(){
		return note;
	}
	/**
	 * 
	 * @param note add note in notebook
	 */
	public void setNote(Note note){
		this.note.add(note);
	}
	

}
