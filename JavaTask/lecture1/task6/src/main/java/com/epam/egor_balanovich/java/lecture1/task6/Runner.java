package com.epam.egor_balanovich.java.lecture1.task6;

import com.epam.egor_balanovich.java.lecture1.task6.notes.NoteManager;
import com.epam.egor_balanovich.java.lecture1.task6.notes.Notebook;


public class Runner {

	/**
	 * Method for enter in program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notebook notebook=new Notebook();
		Notebook notebook1=new Notebook();
		Notebook notebook2=new Notebook();
		NoteManager noteManager=new NoteManager(notebook);
		
		noteManager.addNote("First note");
		noteManager.addNote("Second note");
		noteManager.addNote("Third note");
		
		noteManager.viewNotebook();
		
		noteManager.deleteNote("second");
		
		noteManager.viewNotebook();
		
		noteManager.deleteNote(1);
		
		noteManager.viewNotebook();
		
		noteManager.addNote("Last note in first notebook");
		
		noteManager.editNote(0, "Tut doljen bil bit' adekvatnii text");
		
		
		noteManager.changeNotebook(notebook1);
		
		noteManager.viewNotebook();
		
		noteManager.addNote("Note in second notebook");
		
		noteManager.viewNotebook();
		
		
		
		noteManager.changeNotebook(notebook);
		
		noteManager.viewNotebook();
		
		
		
		noteManager.changeNotebook(notebook2);
		
		noteManager.viewNotebook();
		
	}

}
