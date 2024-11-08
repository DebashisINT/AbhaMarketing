package com.breezefieldabhamarketing.features.survey.api

import com.breezefieldabhamarketing.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldabhamarketing.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}