package com.breezefieldabhamarketing.features.login.api.opportunity

import com.breezefieldabhamarketing.app.Pref
import com.breezefieldabhamarketing.app.utils.AppUtils
import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.addshop.model.AudioFetchDataCLass
import com.breezefieldabhamarketing.features.addshop.model.StockAllResponse
import com.breezefieldabhamarketing.features.dashboard.presentation.DashboardActivity
import com.breezefieldabhamarketing.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezefieldabhamarketing.features.login.model.productlistmodel.ProductListResponseModel
import com.breezefieldabhamarketing.features.orderITC.SyncDeleteOppt
import com.breezefieldabhamarketing.features.orderITC.SyncEditOppt
import com.breezefieldabhamarketing.features.orderITC.SyncOppt
import com.breezefieldabhamarketing.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }

    fun getAudioL(user_id: String,data_limit_in_days:String): Observable<AudioFetchDataCLass> {
        return apiService.getAudioLApi(user_id,data_limit_in_days)
    }


    fun saveLMSModuleInfo(obj: DashboardActivity.LMSModule): Observable<BaseResponse> {
        return apiService.saveLMSModuleInfoApi(obj)
    }

    fun getAllStock(user_id: String): Observable<StockAllResponse> {
        return apiService.getAllStockApi(user_id)
    }
}