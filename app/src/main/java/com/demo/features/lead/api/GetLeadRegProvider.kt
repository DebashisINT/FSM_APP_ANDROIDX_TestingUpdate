package com.demo.features.lead.api

import com.demo.features.NewQuotation.api.GetQuotListRegRepository
import com.demo.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}