package com.fjeport.myapplication;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 * @author linxq
 * @date 2017/11/22
 */

public interface Api {

    @GET
    Observable<LoginResponse> login(@Body LoginRequest request);

    @GET
    Observable<RegisterResponse> register(@Body RegisterRequest request);

    @GET
    Observable<UserBaseInfoResponse> getUserInfo(@Body UserBaseInfoRequest request);

    @GET
    Observable<UserExtraInfoResponse>  getUserExtendInfo(@Body UserExtraInfoRequest request);

}
