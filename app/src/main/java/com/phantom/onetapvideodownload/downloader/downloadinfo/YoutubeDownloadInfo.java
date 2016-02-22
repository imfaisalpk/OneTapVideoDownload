package com.phantom.onetapvideodownload.downloader.downloadinfo;

import android.content.Context;
public class YoutubeDownloadInfo implements DownloadInfo {
    private String mParam, mVideoUrl, mDownloadLocation, mFilename;
    private int mItag;
    private long mDatabaseId = -1;
    private Status mStatus;
    private Context mContext;

    public YoutubeDownloadInfo(Context context, String filename, String url, String downloadPath, String param, int itag) {
        mContext = context;
        mFilename = filename;
        mItag = itag;
        mParam = param;
        mDownloadLocation = downloadPath;
        mVideoUrl = url;
        mStatus = Status.Stopped;
    }

    @Override
    public String getFilename() {
        return mFilename;
    }

    @Override
    public String getUrl() {
        return mVideoUrl;
    }

    @Override
    public long getDatabaseId() {
        return mDatabaseId;
    }

    @Override
    public void setDatabaseId(long databaseId) {
        mDatabaseId = databaseId;
    }

    public String getParam() {
        return mParam;
    }

    public int getItag() {
        return mItag;
    }

    @Override
    public String getDownloadLocation() {
        return mDownloadLocation;
    }

    @Override

    @Override
    public int getStatusCode() {
        return mStatus.getStatus();
    }
}
