package com.breezefieldabhamarketing.features.viewAllOrder.interf

import com.breezefieldabhamarketing.app.domain.NewOrderColorEntity
import com.breezefieldabhamarketing.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}