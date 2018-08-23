package com.huangxin.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Field;

/**
 *
 * {"external": [
      {
        "author": "xxxxx",
        "name": "",
        "cover": {
            "url": "https://xxxxx",
             "md5": "xxxxxxxxx"
         },
        "blur": {

        },
        "paper": {
            "url": "https://xxxxxxxx",
            "md5": "xxxxxxxxx"
        },
        "preview": {
            "url": "https://xxxxxxxx",
            "md5": "xxxxxxxx"
        }
      },
      {
          "author": "xxxxxx",
           "name": "",
           "cover": {
                "url": "https://xxxxxxx",
                "md5": "xxxxxxxxxx"
           },
           "blur": {

            },
            "paper": {
                "url": "https://xxxxxx",
                 "md5": "xxxxxxxxx"
            },
            "preview": {
                 "url": "https://xxxxxxx",
                 "md5": "xxxxxxxxx"
            }
        }
     ],
 "internal": [
     {
           "author": "xxxxxx",
           "name": "",
           "cover": {
                "url": "https://xxxxxxx",
                "md5": "xxxxxxxxxx"
           },
           "blur": {

           },
           "paper": {
                "url": "https://xxxxxxx",
                "md5": "xxxxxxxxxx"
            },
           "preview": {
               "url": "https://xxxxxxx",
               "md5": "xxxxxxxxx"
            }
     },
     {
           "author": "xxxxx",
            "name": "",
            "cover": {
                  "url": "https://xxxxxxx",
                  "md5": "xxxxxxxx"
             },
            "blur": {

            },
            "paper": {
                  "url": "https://xxxxxxx",
                  "md5": "xxxxxxxx"
             },
             "preview": {
                  "url": "https://xxxxxxxx",
                  "md5": "xxxxxxx"
              }
     }
   ]
 }
 */

public class Wallpaper {

    @SerializedName("name")
    private String mName;
    @SerializedName("author")
    private String mAuthor;
    @SerializedName("cover")
    private Paper mCover;
    @SerializedName("paper")
    private Paper mPaper;
    @SerializedName("preview")
    private Paper mPreview;
    @SerializedName("blur")
    private Paper mBlur;


    static class Paper {
        String url;
        String md5;

        @Override
        public String toString() {
            return "Paper{" +
                    "url='" + url + '\'' +
                    ", md5='" + md5 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Wallpaper{" +
                "mName='" + mName + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mCover=" + mCover +
                ", mPaper=" + mPaper +
                ", mPreview=" + mPreview +
                ", mBlur=" + mBlur +
                '}';
    }
}
