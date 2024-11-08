package com.breezefieldabhamarketing.features.login.model.opportunitymodel

import com.breezefieldabhamarketing.app.domain.OpportunityStatusEntity
import com.breezefieldabhamarketing.app.domain.ProductListEntity
import com.breezefieldabhamarketing.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}