package com.example.demo;

import com.example.demo.Instance.AbstractFile;
import com.example.demo.Instance.MusicFile;
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
