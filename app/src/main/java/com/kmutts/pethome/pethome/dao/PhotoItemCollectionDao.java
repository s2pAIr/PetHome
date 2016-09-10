package com.kmutts.pethome.pethome.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ADMIN PC on 10/9/2559.
 */
public class PhotoItemCollectionDao {

    @SerializedName("success")  private boolean success;
    @SerializedName("data")     private List<PhotoItemDao> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<PhotoItemDao> getData() {
        return data;
    }

    public void setData(List<PhotoItemDao> data) {
        this.data = data;
    }
}
