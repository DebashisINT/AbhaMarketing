package com.breezefieldabhamarketing.features.stockAddCurrentStock.api

import com.breezefieldabhamarketing.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldabhamarketing.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}