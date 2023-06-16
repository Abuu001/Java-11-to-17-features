package com.example.demo;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class InstanceOfExample {

    @Test
    public void instanceOfExample(){
        AbstractFile abstractFile = new MusicFile();
        useInstanceOf(abstractFile);
    }

    private void useInstanceOf(AbstractFile abstractFile){
        //initially -  we casted the obj
        if(abstractFile instanceof MusicFile){
             ((MusicFile) abstractFile).playMusic();
        }

        //way better
        if(abstractFile instanceof MusicFile musicFile){
            musicFile.playMusic();
        }

    }
}
