package com.example.projectcrud.app
import com.example.projectcrud.model.BarangModel
import com.example.projectcrud.model.ResponseModel
import okhttp3.MultipartBody
import okhttp3.Response
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @FormUrlEncoded
    @POST("tblproduk/save")
    fun saveBarang(
        @Body data: BarangModel,
    ):Call<ResponseModel>

    @GET("barang")
    fun getBarang():Call<ResponseModel>
}