package com.breezefieldabhamarketing.features.nearbyuserlist.api

import com.breezefieldabhamarketing.app.Pref
import com.breezefieldabhamarketing.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldabhamarketing.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldabhamarketing.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}