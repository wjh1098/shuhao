package com.wjh.shuhao.pojo;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:37
 * @Version 1.0
 */
public class NoteDetail {
    private Integer id;
    private Note note;
    private String noteDetail;
    public NoteDetail(){
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public String getNoteDetail() {
        return noteDetail;
    }

    public void setNoteDetail(String noteDetail) {
        this.noteDetail = noteDetail;
    }

    @Override
    public String toString() {
        return "NoteDetail{" +
                "id=" + id +
                ", note=" + note +
                ", noteDetail='" + noteDetail + '\'' +
                '}';
    }
}
