package com.phantom.onetapvideodownload.Video;

import android.content.Context;
import com.phantom.onetapvideodownload.Global;

public class BrowserVideo implements Video {
    private String mTitle, mUrl;
    private long mDatabaseId = -1;
    private Context mContext;

    public BrowserVideo(Context context, String url) {
        mContext = context;
        mUrl = url;
        mTitle = Global.getFilenameFromUrl(url);
        if (mTitle.isEmpty()) {
            mTitle = "otv_unnamed_video.mp4";
        }
    }

    public BrowserVideo(Context context, String url, String title) {
        mContext = context;
        mUrl = url;
        mTitle = title;
        if (mTitle.isEmpty()) {
            mTitle = Global.getFilenameFromUrl(url);
            if (mTitle.isEmpty()) {
                mTitle = "otv_unnamed_video.mp4";
            }
        }

    }

    @Override
    public String getUrl() {
        return mUrl;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }

    @Override
    public long getDatabaseId() {
        return mDatabaseId;
    }

    @Override
    public void setDatabaseId(long databaseId) {
        mDatabaseId = databaseId;
    }

    @Override
    public void setContext(Context context) {
        mContext = context;
    }

}
