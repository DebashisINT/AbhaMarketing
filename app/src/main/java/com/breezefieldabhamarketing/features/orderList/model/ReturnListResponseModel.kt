package com.breezefieldabhamarketing.features.orderList.model

import com.breezefieldabhamarketing.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}