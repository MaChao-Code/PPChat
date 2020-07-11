package com.mc.ppchat;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

import java.util.Date;

public class Msg extends LitePalSupport {
    public static final int TYPE_RECEVIED = 0;

    public static final int TYPE_SENT = 1;

    private String person;

    private String content;

    private int type;

    private long date;

    public Msg() {
    }

    public Msg(String person, String content, int type, long date) {
        this.person = person;
        this.content = content;
        this.type = type;
        this.date = date;
    }

    public Msg(String content, int type , long data) {
        this.content = content;
        this.type = type;
    }
    public Msg(String content, int type ) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
