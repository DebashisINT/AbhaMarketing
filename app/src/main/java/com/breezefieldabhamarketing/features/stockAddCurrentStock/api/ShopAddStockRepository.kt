package com.breezefieldabhamarketing.features.stockAddCurrentStock.api

import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.location.model.ShopRevisitStatusRequest
import com.breezefieldabhamarketing.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldabhamarketing.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldabhamarketing.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldabhamarketing.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}