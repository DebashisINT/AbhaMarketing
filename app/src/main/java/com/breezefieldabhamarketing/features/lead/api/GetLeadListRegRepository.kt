package com.breezefieldabhamarketing.features.lead.api

import com.breezefieldabhamarketing.base.BaseResponse
import com.breezefieldabhamarketing.features.NewQuotation.model.AddQuotRequestData
import com.breezefieldabhamarketing.features.lead.model.*
import com.breezefieldabhamarketing.features.taskManagement.AddTaskReq
import com.breezefieldabhamarketing.features.taskManagement.EditTaskReq
import com.breezefieldabhamarketing.features.taskManagement.TaskViewRes
import com.breezefieldabhamarketing.features.taskManagement.model.TaskListReq
import io.reactivex.Observable

class GetLeadListRegRepository(val apiService : GetLeadListApi) {
    fun CustomerList(list: CustomerListReq): Observable<CustomerLeadResponse> {
        return apiService.getCustomerList(list)
    }

    fun submitActivity(list: AddActivityReq): Observable<BaseResponse> {
        return apiService.submitActivityListAPI(list)
    }

    fun editActivity(obj: EditActivityReq): Observable<BaseResponse> {
        return apiService.editActivityAPI(obj)
    }


    fun getActivityList(crm_id: String): Observable<ActivityViewRes> {
        return apiService.viewActivityList(crm_id)
    }

    fun TaskList(list: TaskListReq): Observable<TaskResponse> {
        return apiService.getTaskList(list)
    }

    fun submitTask(list: AddTaskReq): Observable<BaseResponse> {
        return apiService.submitTaskListAPI(list)
    }

    fun getTaskList(task_id: String): Observable<TaskViewRes> {
        return apiService.viewTaskList(task_id)
    }

    fun editTask(obj: EditTaskReq): Observable<BaseResponse> {
        return apiService.editTaskAPI(obj)
    }

}