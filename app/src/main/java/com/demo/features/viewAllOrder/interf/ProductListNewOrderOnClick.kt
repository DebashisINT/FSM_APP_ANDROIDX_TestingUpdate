package com.demo.features.viewAllOrder.interf

import com.demo.app.domain.NewOrderGenderEntity
import com.demo.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}