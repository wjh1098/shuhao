package com.wjh.shuhao.pojo;

import java.sql.Date;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:34
 * @Version 1.0
 */
public class Note {
    private Integer id;
    private String noteTitle;
    private String noteImg;
    private Date noteDate;
    private String noteDesc;
    private String noteKind;
    private String noteDetail;

    public Note() {
    }

    public Note(Integer id) {
        this.id = id;
    }

    public Note(String noteTitle, String noteImg, String noteDesc, String noteKind, String noteDetail) {
        this.noteTitle = noteTitle;
        this.noteImg = noteImg;
        this.noteDesc = noteDesc;
        this.noteKind = noteKind;
        this.noteDetail = noteDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteImg() {
        return noteImg;
    }

    public void setNoteImg(String noteImg) {
        this.noteImg = noteImg;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    public String getNoteDesc() {
        return noteDesc;
    }

    public void setNoteDesc(String noteDesc) {
        this.noteDesc = noteDesc;
    }

    public String getNoteKind() {
        return noteKind;
    }

    public void setNoteKind(String noteKind) {
        this.noteKind = noteKind;
    }

    public String getNoteDetail() {
        return noteDetail;
    }

    public void setNoteDetail(String noteDetail) {
        this.noteDetail = noteDetail;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", noteTitle='" + noteTitle + '\'' +
                ", noteImg='" + noteImg + '\'' +
                ", noteDate=" + noteDate +
                ", noteDesc='" + noteDesc + '\'' +
                ", noteKind='" + noteKind + '\'' +
                ", noteDetail='" + noteDetail + '\'' +
                '}';
    }
}
