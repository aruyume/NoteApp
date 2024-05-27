package com.example.noteapp.interfaces

import com.example.noteapp.data.model.NoteModel

interface OnClickItem {
    fun onLongClick(noteModel: NoteModel)

    fun onClick(noteModel: NoteModel)
}