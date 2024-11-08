package com.breezefieldabhamarketing.features.location.shopRevisitStatus

import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.location.model.ShopDurationRequest
import com.breezefieldabhamarketing.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}