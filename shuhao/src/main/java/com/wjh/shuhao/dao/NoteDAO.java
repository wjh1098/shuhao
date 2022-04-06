package com.wjh.shuhao.dao;

import com.wjh.shuhao.pojo.Note;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:39
 * @Version 1.0
 */
public interface NoteDAO {
    //获取笔记列表
    public List<Note> getNoteList();

    //添加笔记
    public void addNote(Note note);
}
