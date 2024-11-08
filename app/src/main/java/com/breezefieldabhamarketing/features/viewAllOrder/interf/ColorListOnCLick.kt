package com.breezefieldabhamarketing.features.viewAllOrder.interf

import com.breezefieldabhamarketing.app.domain.NewOrderGenderEntity
import com.breezefieldabhamarketing.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}