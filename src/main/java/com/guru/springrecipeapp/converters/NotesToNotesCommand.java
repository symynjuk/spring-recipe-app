package com.guru.springrecipeapp.converters;

import com.guru.springrecipeapp.commands.NotesCommand;
import com.guru.springrecipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand> {
    @Override
    @Nullable
    @Synchronized
    public NotesCommand convert(Notes notes) {
        if(notes == null){
            return null;
        }
        final NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(notes.getId());
        notesCommand.setRecipeNotes(notes.getRecipeNotes());
        return notesCommand;
    }
}
