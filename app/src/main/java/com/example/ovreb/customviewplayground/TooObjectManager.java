package com.example.ovreb.customviewplayground;

import java.util.ArrayList;

/**
 * Created by ovreb on 14.12.2017.
 */

public class TooObjectManager {
    private ArrayList<TooObject> mObjectList;

    public TooObjectManager(){
        mObjectList = new ArrayList<>();
    }

    public void add(TooObject newObject){
        mObjectList.add(newObject);
    }

    public TooObject get(int index){
        return mObjectList.get(index);
    }

    public int getCount(){
        return mObjectList.size();
    }

}

