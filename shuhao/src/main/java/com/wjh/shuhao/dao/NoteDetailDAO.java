package com.wjh.shuhao.dao;

import com.wjh.shuhao.pojo.NoteDetail;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:48
 * @Version 1.0
 */
public interface NoteDetailDAO {
    //获取详细笔记通过noteId
    public NoteDetail getNoteDetailByNoteId(Integer noteId);

}
