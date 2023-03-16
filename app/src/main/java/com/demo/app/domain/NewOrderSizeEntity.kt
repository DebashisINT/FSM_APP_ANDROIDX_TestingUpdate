package com.demo.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.demo.app.AppConstant

@Entity(tableName = AppConstant.NEW_ORDER_SIZE)
class NewOrderSizeEntity {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0


    @ColumnInfo(name = "product_id")
    var product_id: Int? = 0

    @ColumnInfo(name = "size")
    var size: String? = null
}