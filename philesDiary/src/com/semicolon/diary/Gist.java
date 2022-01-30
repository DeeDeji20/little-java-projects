package com.semicolon.diary;

import java.time.LocalDateTime;

public class Gist {
    private String title;
    private LocalDateTime time = LocalDateTime.now();
    private String gistBody;

    public Gist(String title, String gistBody) {
        this.title = title;
        this.gistBody = gistBody;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getGistBody() {
        return gistBody;
    }

    public void setGistBody(String gistBody) {
        this.gistBody = gistBody;
    }
}
