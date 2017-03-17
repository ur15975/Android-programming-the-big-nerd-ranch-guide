package com.example.ur15975outlookcom.geoquiz;

import java.util.UUID;

/**
 * Created by ur15975@outlook.com on 2017/3/17.
 */

public class Crime {
    private UUID mID;
    private String  mTitle;

    public Crime() {
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
