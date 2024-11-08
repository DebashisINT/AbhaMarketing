package com.breezefieldabhamarketing.features.viewAllOrder.orderOptimized

import com.breezefieldabhamarketing.app.domain.ProductOnlineRateTempEntity
import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}