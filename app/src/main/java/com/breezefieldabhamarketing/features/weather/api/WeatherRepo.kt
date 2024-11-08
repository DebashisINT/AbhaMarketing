package com.breezefieldabhamarketing.features.weather.api

import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.task.api.TaskApi
import com.breezefieldabhamarketing.features.task.model.AddTaskInputModel
import com.breezefieldabhamarketing.features.weather.model.ForeCastAPIResponse
import com.breezefieldabhamarketing.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}