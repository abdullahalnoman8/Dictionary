package com.softmaker.gazi_opu.mydictionary;

import java.util.ArrayList;

/**
 * Created by gazi_opu on 9/14/2015.
 */
public class WordDefinition {
    String word,definition;

    public WordDefinition(String word,ArrayList<String> alldefinition) {
        this.word=word;

        StringBuilder stringBuilder=new StringBuilder();
        for (String string : alldefinition) {
            stringBuilder.append(string);
        }
        this.definition=stringBuilder.toString();

    }

    public WordDefinition(String word,String alldefinition) {
        this.word=word;
        this.definition=alldefinition;

    }

}
