package com.bhargav.tool.ModelClass;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface ApiService {

    String BASEURL = "Api_Name";

    @GET("clientes")
    Call<Clientes> clientsData(@Query("arg0") String arg0);

  
}

