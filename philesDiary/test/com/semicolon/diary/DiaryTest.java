package com.semicolon.diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    @BeforeEach
    public void setUp(){
        diary = new Diary("Dee", "1234");
    }

    @Test
    public void diaryPasswordCanBeUpdatedTest(){
        diary.setPassword("Dee");
        assertEquals("Dee", diary.getPassword());
    }
    @Test
    public void diaryCanAddGistTest(){
//        Gist gist = new Gist("My gist", "Mycool gist");
        diary.addNewGist("My true love", "My true lover name is...", "1234");
        assertEquals(1, diary.getGists().size());
    }

    @Test
    public void viewGistByTitleTest(){
        diary.addNewGist("My first gist", "My true lover name is...", "1234");
        diary.addNewGist("My second gist", "Not ready for a gist right now...", "1234");
        diary.addNewGist("My third gist", "Amebo, rest!!...", "1234");
        assertEquals(3, diary.getGists().size());

        Gist foundGist = diary.getGistByTitle("My third gist");
        assertEquals("My third gist", foundGist.getTitle());
    }

    @Test
    public void testThatGistCanBeDeleted(){
        diary.addNewGist("My first gist", "My true lover name is...", "1234");
        diary.addNewGist("My second gist", "Not ready for a gist right now...", "1234");
        diary.addNewGist("My third gist", "Amebo, rest!!...", "1234");
        assertEquals(3, diary.getGists().size());

        diary.deleteGistFromLiist("My second gist", "1234");
        System.out.println(diary.getGists());
        assertEquals(2, diary.getGists().size());

    }

    @Test
    public void testThatAllTestsCanBeViewed(){
        diary.addNewGist("My first gist", "My true lover name is...", "1234");
        diary.addNewGist("My second gist", "Not ready for a gist right now...", "1234");
        diary.addNewGist("My third gist", "Amebo, rest!!...", "1234");

        ArrayList<Gist> gists = diary.viewAllGist("1234");
//        List<String> gist1 = asList("My true lover name is...", "Not ready for a gist right now...");
//        assertArrayEquals({ "My true lover name is..."}, ["My second gist", "Not ready for a gist right now..."]);
        assertEquals(diary.getGists(), gists);
    }

    @Test
    public void testThatAllTestsCanNotBeViewedWithWrongPin() throws IllegalArgumentException{
        diary.addNewGist("My first gist", "My true lover name is...", "1234");
        diary.addNewGist("My second gist", "Not ready for a gist right now...", "1234");
        diary.addNewGist("My third gist", "Amebo, rest!!...", "1234");

        assertThrows(IllegalArgumentException.class, ()->diary.viewAllGist("dee"));
    }

    @Test
    public void testThatAllAGistCanBeMarkedAsHotGist(){

    }
}