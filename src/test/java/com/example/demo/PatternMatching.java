package com.example.demo;

import com.example.demo.Instance.AbstractFile;
import com.example.demo.Instance.MusicFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PatternMatching {

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

    private void patternMatchingExample(Object obj){
        //before
        if(obj instanceof String){      // a) test: is obj a string
            String s = (String) obj;    // b) declaration of new variable s
            //use                       // c) casting of obj into a string
        }


        //after
        if(obj instanceof String s){
            //use s
        }
    }
}
