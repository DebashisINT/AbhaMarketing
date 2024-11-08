package com.breezefieldabhamarketing.features.alarm.model

import com.breezefieldabhamarketing.base.BaseResponse

/**
 * Created by Kinsuk on 20-02-2019.
 */
class AttendanceReportDataModel : BaseResponse() {
    var attendance_report_list: ArrayList<AttendanceReport>? = null
}