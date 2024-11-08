package com.breezefieldabhamarketing.features.viewAllOrder.interf

import com.breezefieldabhamarketing.app.domain.NewOrderGenderEntity
import com.breezefieldabhamarketing.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}