package com.demo.features.viewAllOrder.interf

import com.demo.app.domain.NewOrderGenderEntity
import com.demo.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}