package com.breezefieldabhamarketing.features.mylearning.apiCall

import com.breezefieldabhamarketing.features.login.api.opportunity.OpportunityListApi
import com.breezefieldabhamarketing.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}