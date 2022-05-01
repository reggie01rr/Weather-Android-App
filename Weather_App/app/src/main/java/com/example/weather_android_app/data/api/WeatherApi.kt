package com.example.weather_android_app.data.api

import com.example.weather_android_app.data.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("data/2.5/onecall?exclude=minutely,hourly,alerts&appid=bbf78cb107dbd2df274c7fe1a4bafb91")
    //Api-Key: bbf78cb107dbd2df274c7fe1a4bafb91

    suspend fun getWeatherInformation(
        @Query("lat") lat: String,
        @Query("lon") long: String,
        @Query("units") units: String
    ): Response<WeatherResponse>

}