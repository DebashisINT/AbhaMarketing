package com.breezefieldabhamarketing.features.photoReg.present

import com.breezefieldabhamarketing.app.domain.ProspectEntity
import com.breezefieldabhamarketing.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}