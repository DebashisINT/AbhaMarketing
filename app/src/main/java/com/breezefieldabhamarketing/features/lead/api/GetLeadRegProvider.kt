package com.breezefieldabhamarketing.features.lead.api

import com.breezefieldabhamarketing.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldabhamarketing.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}