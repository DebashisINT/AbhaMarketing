package com.breezefieldabhamarketing.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldabhamarketing.app.FileUtils
import com.breezefieldabhamarketing.app.Pref
import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.addshop.model.AddLogReqData
import com.breezefieldabhamarketing.features.addshop.model.AddShopRequestData
import com.breezefieldabhamarketing.features.addshop.model.AddShopResponse
import com.breezefieldabhamarketing.features.addshop.model.LogFileResponse
import com.breezefieldabhamarketing.features.addshop.model.UpdateAddrReq
import com.breezefieldabhamarketing.features.contacts.CallHisDtls
import com.breezefieldabhamarketing.features.contacts.CompanyReqData
import com.breezefieldabhamarketing.features.contacts.ContactMasterRes
import com.breezefieldabhamarketing.features.contacts.SourceMasterRes
import com.breezefieldabhamarketing.features.contacts.StageMasterRes
import com.breezefieldabhamarketing.features.contacts.StatusMasterRes
import com.breezefieldabhamarketing.features.contacts.TypeMasterRes
import com.breezefieldabhamarketing.features.dashboard.presentation.DashboardActivity
import com.breezefieldabhamarketing.features.login.model.WhatsappApiData
import com.breezefieldabhamarketing.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}