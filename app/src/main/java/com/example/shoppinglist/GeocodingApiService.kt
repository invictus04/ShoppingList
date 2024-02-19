package com.example.shoppinglist


import com.google.android.gms.maps.model.LatLng
import retrofit2.http.GET
import retrofit2.http.Query

@GET("maps/api/geocode/json")           //----> This line does not show error when we integrate it with the google cloud

interface GeocodingApiService {
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latLng: String,
        @Query("key") apiKey: String
    ): GeocodingResponse
}