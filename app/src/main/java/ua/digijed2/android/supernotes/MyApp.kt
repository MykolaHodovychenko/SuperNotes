package ua.digijed2.android.supernotes

import android.app.Application
import ua.digijed2.android.supernotes.data.datasource.local.NotesDatabase
import ua.digijed2.android.supernotes.data.repository.NoteRepository

class MyApp : Application() {

    private val database by lazy {
        NotesDatabase.getDatabase(this)
    }

    val repository by lazy {
        NoteRepository(database.noteDao())
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: MyApp
            private set
    }
}