package com.breezefieldabhamarketing.features.weather.api

import com.breezefieldabhamarketing.features.task.api.TaskApi
import com.breezefieldabhamarketing.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}