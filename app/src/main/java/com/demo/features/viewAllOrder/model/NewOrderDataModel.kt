package com.demo.features.viewAllOrder.model

import com.demo.app.domain.NewOrderColorEntity
import com.demo.app.domain.NewOrderGenderEntity
import com.demo.app.domain.NewOrderProductEntity
import com.demo.app.domain.NewOrderSizeEntity
import com.demo.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

