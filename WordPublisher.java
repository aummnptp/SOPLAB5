package com.example.lab5rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WordPublisher  {
//    @Autowired
    protected Word words = new Word();

//    ArrayList<String> goodWords = words.get();


    @RequestMapping(value = "/addBad/{word}",method = RequestMethod.GET)
    public ArrayList<String> addBadWord(@PathVariable("word") String s){
        words.badWords.add(s);
        return words.badWords;

    }

    String input = "Java is the best programming language";
//    boolean isPresent = input.indexOf() != -1 ? true : false;
    @RequestMapping(value = "/delBad/{word}",method = RequestMethod.GET)
    public ArrayList<String> deleteBadWord(@PathVariable("word") String s){
        words.badWords.remove(s);
        return words.badWords;
    }

    @RequestMapping(value = "/addGood/{s}",method = RequestMethod.GET)
    public ArrayList<String> addGoodWord(@PathVariable("s") String s){
        words.goodWords.add(s);
        return words.goodWords;

    }

    @RequestMapping(value = "/delGood/{word}",method = RequestMethod.GET)
    public ArrayList<String> deleteGoodWord(@PathVariable("word") String s){
        words.goodWords.remove(s);
        return words.goodWords;

    }

//    boolean isPresent = input.indexOf(words.get()) != -1 ? true : false;
//    @RequestMapping(value = "/proof/{sentence}",method = RequestMethod.GET)
//    public void proofSentence(@PathVariable("sentence") String s){
//        if(s){
//
//        }
//    }
}
