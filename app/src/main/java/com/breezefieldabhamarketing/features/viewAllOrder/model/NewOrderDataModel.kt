package com.breezefieldabhamarketing.features.viewAllOrder.model

import com.breezefieldabhamarketing.app.domain.NewOrderColorEntity
import com.breezefieldabhamarketing.app.domain.NewOrderGenderEntity
import com.breezefieldabhamarketing.app.domain.NewOrderProductEntity
import com.breezefieldabhamarketing.app.domain.NewOrderSizeEntity
import com.breezefieldabhamarketing.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

