package com.wjh.shuhao.service;

import com.wjh.shuhao.pojo.Note;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:52
 * @Version 1.0
 */
public interface NoteService {
    //获取所有笔记
    public List<Note> getNoteList();

    //添加笔记
    public void addNote(Note note);
}
