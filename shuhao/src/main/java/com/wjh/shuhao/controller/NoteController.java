package com.wjh.shuhao.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wjh.shuhao.pojo.Note;
import com.wjh.shuhao.service.NoteService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

/**
 * @Author: wjh
 * @Date: 2022/4/6 18:55
 * @Version 1.0
 */
public class NoteController {
    private NoteService noteService;

    public String getNote() {
        List<Note> noteList = noteService.getNoteList();
        Gson gson = new Gson();
        String noteListJson = gson.toJson(noteList);
        return "json:" + noteListJson;
    }
    public String addNote(HttpServletRequest request, HttpServletResponse response) throws IOException {
            BufferedReader reader = request.getReader();
            StringBuffer buffer = new StringBuffer();
            String bufferTemp = null;
            while ((bufferTemp = reader.readLine()) != null) {
                buffer.append(bufferTemp);
            }
            String gsonStr = buffer.toString();
            Gson gson = new Gson();
            Note note = gson.fromJson(gsonStr, Note.class);
            note.setNoteDate(new Date(new java.util.Date().getTime()));
            noteService.addNote(note);
            return "index";
    }


}
