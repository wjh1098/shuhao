package com.wjh.shuhao.dao.impl;

import com.wjh.myssm.basedao.BaseDAO;
import com.wjh.shuhao.dao.NoteDAO;
import com.wjh.shuhao.pojo.Note;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:40
 * @Version 1.0
 */
public class NoteDAOImpl extends BaseDAO<Note> implements NoteDAO {
    @Override
    public List<Note> getNoteList() {
        return super.executeQuery("select * from t_note");
    }

    @Override
    public void addNote(Note note) {
        super.executeUpdate("insert into t_note values(0,?,?,?,?,?,?)", note.getNoteTitle(), note.getNoteImg(), note.getNoteDate(), note.getNoteDesc(), note.getNoteKind(), note.getNoteDetail());
    }

}
