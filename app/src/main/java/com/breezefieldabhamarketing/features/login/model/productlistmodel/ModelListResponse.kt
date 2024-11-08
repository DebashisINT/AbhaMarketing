package com.breezefieldabhamarketing.features.login.model.productlistmodel

import com.breezefieldabhamarketing.app.domain.ModelEntity
import com.breezefieldabhamarketing.app.domain.ProductListEntity
import com.breezefieldabhamarketing.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}