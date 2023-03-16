package com.demo.features.location.api

import com.demo.features.location.shopdurationapi.ShopDurationApi
import com.demo.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}