package com.breezefieldabhamarketing.features.document.api

import com.breezefieldabhamarketing.features.dymanicSection.api.DynamicApi
import com.breezefieldabhamarketing.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}