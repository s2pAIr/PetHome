package com.kmutts.pethome.pethome.manager.http;

import com.kmutts.pethome.pethome.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by ADMIN PC on 10/9/2559.
 */
public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();

}
