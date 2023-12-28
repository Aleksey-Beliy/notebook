package edu.trainint.lesson16.dao;

import java.util.List;

import edu.trainint.lesson16.entity.Note;
import edu.trainint.lesson16.entity.Notebook;
import edu.trainint.lesson16.source.NotebookProvider;

public class NotebookDao {

	
	  public void create() { 
		  NotebookProvider.getInstance(); 
		  }
	 

	private final NotebookProvider provider = NotebookProvider.getInstance();
	private final Notebook nb = provider.getNotebook();

	public void save(Note n) {
		nb.setNotes(n);
	}

	public List<Note> allNotes() {
		return nb.getNotes();
	}

}