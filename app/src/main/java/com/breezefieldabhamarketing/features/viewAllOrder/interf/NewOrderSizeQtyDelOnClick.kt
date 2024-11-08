package com.breezefieldabhamarketing.features.viewAllOrder.interf

import com.breezefieldabhamarketing.app.domain.NewOrderGenderEntity
import com.breezefieldabhamarketing.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}