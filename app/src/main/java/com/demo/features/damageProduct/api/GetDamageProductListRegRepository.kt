package com.demo.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.demo.app.FileUtils
import com.demo.base.BaseResponse
import com.demo.features.NewQuotation.model.*
import com.demo.features.addshop.model.AddShopRequestData
import com.demo.features.addshop.model.AddShopResponse
import com.demo.features.damageProduct.model.DamageProductResponseModel
import com.demo.features.damageProduct.model.delBreakageReq
import com.demo.features.damageProduct.model.viewAllBreakageReq
import com.demo.features.login.model.userconfig.UserConfigResponseModel
import com.demo.features.myjobs.model.WIPImageSubmit
import com.demo.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}