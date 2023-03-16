package com.demo.features.viewAllOrder.orderOptimized

import com.demo.app.domain.ProductOnlineRateTempEntity
import com.demo.base.BaseResponse
import com.demo.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}