package com.breezefieldabhamarketing.features.location.api

import com.breezefieldabhamarketing.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldabhamarketing.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}