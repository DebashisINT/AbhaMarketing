package com.breezefieldabhamarketing.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldabhamarketing.app.FileUtils
import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.NewQuotation.model.*
import com.breezefieldabhamarketing.features.addshop.model.AddShopRequestData
import com.breezefieldabhamarketing.features.addshop.model.AddShopResponse
import com.breezefieldabhamarketing.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldabhamarketing.features.damageProduct.model.delBreakageReq
import com.breezefieldabhamarketing.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldabhamarketing.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldabhamarketing.features.myjobs.model.WIPImageSubmit
import com.breezefieldabhamarketing.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}