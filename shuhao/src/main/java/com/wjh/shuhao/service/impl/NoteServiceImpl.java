package com.wjh.shuhao.service.impl;

import com.wjh.shuhao.dao.NoteDAO;
import com.wjh.shuhao.dao.impl.NoteDAOImpl;
import com.wjh.shuhao.pojo.Note;
import com.wjh.shuhao.service.NoteService;
import org.junit.Test;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:53
 * @Version 1.0
 */
public class NoteServiceImpl implements NoteService {
    private NoteDAO noteDAO;

    @Override
    public List<Note> getNoteList() {
        return noteDAO.getNoteList();
    }

    @Override
    public void addNote(Note note) {
        noteDAO.addNote(note);
    }

    @Test
    public void test() {
        NoteDAO noteDAO = new NoteDAOImpl();
        List<Note> noteList = noteDAO.getNoteList();
        for (Note note : noteList) {
            System.out.println(note);
        }
    }
}
