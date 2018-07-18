package com.example.aml.tourguide;

/**
 * Created by Aml on 2017-12-12.
 */
public class List {
  private String item;
   // private int mImageResourceId=NO_IMAGE_PROVIDED ;
   // private static final int NO_IMAGE_PROVIDED =-1;
    public List(String itemList)
    {
        item = itemList;
    }
   /* public List(String itemList,int imageResourceId)
    {
        item = itemList;
        mImageResourceId = imageResourceId;
    }
*/
    public String getItem() {
        return item;
    }
   /* public int getmImageResourceId ()
    {return mImageResourceId;
    }
    public boolean hasImage()

    {
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
    */
}
