package firstproject.tranhaison.takenote;

import java.io.Serializable;

/**
 * This class Note is used to store the information about a note:
 * 1. ID of the note
 * 2. Title of the note
 * 3. Note
 */
public class Note implements Serializable {
    private long id;
    private String title;
    private String note;

    public Note() {

    }

    public Note(long id, String title, String note) {
        this.id = id;
        this.title = title;
        this.note = note;
    }

    public Note(String title, String note) {
        this.title = title;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
