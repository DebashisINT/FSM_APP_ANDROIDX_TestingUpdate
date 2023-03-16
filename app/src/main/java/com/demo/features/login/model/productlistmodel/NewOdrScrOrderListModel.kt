package com.demo.features.login.model.productlistmodel

import com.demo.app.domain.NewOrderScrOrderEntity
import com.demo.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}