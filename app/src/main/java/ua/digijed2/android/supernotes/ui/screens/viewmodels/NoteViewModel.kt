package ua.digijed2.android.supernotes.ui.screens.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import ua.digijed2.android.supernotes.MyApp
import ua.digijed2.android.supernotes.data.model.Note
import java.util.*

class NoteViewModel : ViewModel() {

    private val repository = MyApp.instance.repository

    val noteTitle = mutableStateOf("")
    val noteText = mutableStateOf("")

    fun clearNoteTextFields() {
        noteTitle.value = ""
        noteText.value = ""
    }

    fun addNote() {
        val date = Date()

        val note = Note(
            title = noteTitle.value,
            text = noteText.value,
            created = date,
            updated = date
        )

        viewModelScope.launch(Dispatchers.IO) {
            repository.addNote(note)
        }
    }

}