package com.demo.features.photoReg.present

import com.demo.app.domain.ProspectEntity
import com.demo.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}