package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EntityProperty(

                          @Expose
                          @SerializedName("EntityId")
                          var EntityId: Long? = null,

                          @Expose
                          @SerializedName("EntityName")
                          var EntityName: String? = null,

                          @Expose
                          @SerializedName("PropertyName")
                          var PropertyName: String? = null,

                          @Expose
                          @SerializedName("Value")
                          var Value: String? = null
)


