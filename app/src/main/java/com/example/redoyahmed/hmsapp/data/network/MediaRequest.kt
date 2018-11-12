package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.File

/**
 * Created by jyotidubey on 11/01/18.
 */
class MediaRequest {


    data class ServerMediaRequest internal constructor(

            @Expose
            @SerializedName("Page") internal val Page: Int,
            @Expose
            @SerializedName("Count") internal val Count: Int

    )


    data class ServerMediaPostRequest internal constructor(

            @Expose
            @SerializedName("FileName")
            internal val FileName: String,

            @Expose
            @SerializedName("ImageFile")
            internal val ImageFile: File)


}
