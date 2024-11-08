package com.breezefieldabhamarketing.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldabhamarketing.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldabhamarketing.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}