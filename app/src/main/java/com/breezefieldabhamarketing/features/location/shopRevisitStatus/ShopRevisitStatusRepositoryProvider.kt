package com.breezefieldabhamarketing.features.location.shopRevisitStatus

import com.breezefieldabhamarketing.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldabhamarketing.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}