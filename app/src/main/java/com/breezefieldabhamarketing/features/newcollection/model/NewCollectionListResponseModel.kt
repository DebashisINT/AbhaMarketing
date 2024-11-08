package com.breezefieldabhamarketing.features.newcollection.model

import com.breezefieldabhamarketing.app.domain.CollectionDetailsEntity
import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}