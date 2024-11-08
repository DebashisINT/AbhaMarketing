package com.breezefieldabhamarketing.features.newcollectionreport

import com.breezefieldabhamarketing.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}