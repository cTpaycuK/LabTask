package com.epam.egor_balanovich.java.lecture1.task6.notes;

/**
 * 
 * Class for working with notes in notebook
 * @author Egor_Balanovich
 *
 */
public class NoteManager {

	private Notebook notebook;
	
/**
 * 
 * @param notebook object of Notebook
 */
	public NoteManager(Notebook notebook){
		this.notebook=notebook;
	}
	/**
	 * This method create note 
	 * with id and text and
	 * add note in notebook
	 * Id generated automatically 
	 * @param str text of note
	 */
	public void addNote(String str){
		Note note=new Note();
		int id=notebook.getNote().size();
		note.setId(id);
		note.setNote(str);
		notebook.setNote(note);
	}
	/**
	 * This method return all notes or text "Notebook is clean"
	 * when notebook is clean
	 */
	public void viewNotebook(){
		if(notebook.getNote().size()==0){
			System.out.println("Ниодной записи не добавлено");
		}else{
			for(Note note: notebook.getNote()){
				System.out.println(note.getNote());
			}
		}
	}
	/**
	 * Delete note from notebook by text
	 * @param str part of note for word's search
	 */
	public void deleteNote(String str){
		if(notebook.getNote().size()==1){
			notebook.getNote().clear();
		}else{
			String partOfNote;
			for(Note note:notebook.getNote()){
				partOfNote=note.getNote().toLowerCase();
				if(partOfNote.contains(str.toLowerCase())){
					notebook.getNote().remove(note.getId());
					updateId(note.getId());
				}
			}
		}
	}
	/**
	 * Delete note by id
	 * @param id number of note in notebook
	 */
	public void deleteNote(int id){
		notebook.getNote().remove(id);
		updateId(id);
	}
	/**
	 * Change working notebook
	 * @param notebook
	 */
	public void changeNotebook(Notebook notebook){
		this.notebook=notebook;
	}
	
	/**
	 * Edit text in exist note
	 * @param id number of note
	 * @param text new note text
	 */
	public void editNote(int id, String text){
		if(notebook.getNote().size()<id){
			System.out.println("Записи с таким номером не существует");
		}else{
			notebook.getNote().get(id).setNote(text);
		}
	}
	/**
	 * Update id of note after note delete
	 * @param id number with which it start to change
	 */
	private void updateId(int id){
		int j=0;
		for(int i=id;i<notebook.getNote().size();i++){
			j=notebook.getNote().get(i).getId();
			notebook.getNote().get(i).setId(--j);
		}
	}

}
