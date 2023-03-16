package com.demo.features.viewAllOrder.interf

import com.demo.app.domain.NewOrderColorEntity
import com.demo.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}