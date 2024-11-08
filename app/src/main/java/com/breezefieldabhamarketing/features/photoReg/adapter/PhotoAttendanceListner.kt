package com.breezefieldabhamarketing.features.photoReg.adapter

import com.breezefieldabhamarketing.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}