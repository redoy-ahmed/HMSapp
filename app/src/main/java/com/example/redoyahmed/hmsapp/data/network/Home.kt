package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Home(

    @Expose
    @SerializedName("noOfAllottedBeds")
    var noOfAllottedBeds: Int? = 0,

    @Expose
    @SerializedName("noOfReportsToBeDelivered")
    var noOfReportsToBeDelivered: Int? = 0,

    @Expose
    @SerializedName("noOfAvailableBloodBags")
    var noOfAvailableBloodBags: Int? = 0,

    @Expose
    @SerializedName("noOfTotalDoctors")
    var noOfTotalDoctors: Int? = 0,

    @Expose
    @SerializedName("noOfDoctorsInDept1")
    var noOfDoctorsInDept1: Int? = 0,

    @Expose
    @SerializedName("noOfDoctorsInDept2")
    var noOfDoctorsInDept2: Int? = 0,

    @Expose
    @SerializedName("noOfDoctorsInDept3")
    var noOfDoctorsInDept3: Int? = 0,

    @Expose
    @SerializedName("noOfDoctorsInDept4")
    var noOfDoctorsInDept4: Int? = 0,

    @Expose
    @SerializedName("noOfTotalAppointedPatients")
    var noOfTotalAppointedPatients: Int? = 0,

    @Expose
    @SerializedName("noOfAppointedPatientsInDept1")
    var noOfAppointedPatientsInDept1: Int? = 0,

    @Expose
    @SerializedName("noOfAppointedPatientsInDept2")
    var noOfAppointedPatientsInDept2: Int? = 0,

    @Expose
    @SerializedName("noOfAppointedPatientsInDept3")
    var noOfAppointedPatientsInDept3: Int? = 0,

    @Expose
    @SerializedName("noOfAppointedPatientsInDept4")
    var noOfAppointedPatientsInDept4: Int? = 0
)