package com.wjh.shuhao.dao.impl;

import com.wjh.myssm.basedao.BaseDAO;
import com.wjh.shuhao.dao.NoteDetailDAO;
import com.wjh.shuhao.pojo.NoteDetail;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:49
 * @Version 1.0
 */
public class NoteDetailDAOImpl extends BaseDAO<NoteDetail> implements NoteDetailDAO {
    @Override
    public NoteDetail getNoteDetailByNoteId(Integer noteId) {
        return load("select * from t_noteDetail where note = ?", noteId);
    }
}
