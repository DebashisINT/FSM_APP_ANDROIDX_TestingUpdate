package com.demo.features.viewAllOrder.interf

import com.demo.app.domain.NewOrderProductEntity
import com.demo.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}