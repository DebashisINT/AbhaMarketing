package com.breezefieldabhamarketing.features.viewAllOrder.interf

import com.breezefieldabhamarketing.app.domain.NewOrderProductEntity
import com.breezefieldabhamarketing.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}