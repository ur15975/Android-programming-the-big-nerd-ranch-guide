package com.example.ur15975outlookcom.geoquiz;

import java.util.Date;
import java.util.UUID;
import android.text.format.DateFormat;

/**
 * Created by ur15975@outlook.com on 2017/3/17.
 */

public class Crime {
    private UUID mID;
    private String  mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
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

    public String  getDate() {
        return (String) DateFormat.format("MMM dd, yyyy h:mmaa", mDate);
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
