package edu.trainint.lesson16.start;

import java.util.List;

import edu.trainint.lesson16.entity.Note;
import edu.trainint.lesson16.logic.NotebookLogic;
import edu.trainint.lesson16.output.NotebookOutput;

public class Main {

	public static void main(String[] args) {

		NotebookLogic logic = new NotebookLogic();

		logic.add("title1", "content1");
		logic.add("title2", "content2");
		logic.add("title3", "content3");

		List<Note> myNotes = logic.allNotes();

		NotebookOutput output = new NotebookOutput();

		output.print("all notes", myNotes);

	}

}