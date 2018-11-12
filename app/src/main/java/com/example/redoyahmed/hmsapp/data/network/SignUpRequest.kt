package com.example.redoyahmed.hmsapp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SignUpRequest {

    data class ServerSignUpRequest internal constructor(@Expose
                                                        @SerializedName("Email") internal val Email: String,

                                                        @Expose
                                                        @SerializedName("Password") internal val Password: String,

                                                        @Expose
                                                        @SerializedName("ConfirmPassword") internal val ConfirmPassword: String,

                                                        @Expose
                                                        @SerializedName("FirstName") internal val FirstName: String,

                                                        @Expose
                                                        @SerializedName("LastName") internal val LastName: String,

                                                        @Expose
                                                        @SerializedName("Agreement") internal val Agreement: String,

                                                        @Expose
                                                        @SerializedName("ReferrerId") internal val ReferrerId: Int,

                                                        @Expose
                                                        @SerializedName("StanfordWorkplaceURL") internal val StanfordWorkplaceURL: String,

                                                        @Expose
                                                        @SerializedName("CommunityId") internal val CommunityId: String,

                                                        @Expose
                                                        @SerializedName("Cohort") internal val Cohort: String,

                                                        @Expose
                                                        @SerializedName("Remarks") internal val Remarks: String,

                                                        @Expose
                                                        @SerializedName("MobileNumber") internal val MobileNumber: String,

                                                        @Expose
                                                        @SerializedName("BriefBio")
                                                        internal val BriefBio: String = "",

                                                        @Expose
                                                        @SerializedName("Headline")
                                                        internal val Headline: String = "",

                                                        @Expose
                                                        @SerializedName("DateofBirth")
                                                        internal val DateofBirth: String = "")


    data class ServerFacebookMobileSignUpRequest internal constructor(

            @Expose
            @SerializedName("MobileNumber") internal val MobileNumber: String

            )
}
//
//[Required]
//public string Email { get; set; }
//
//[Required]
//public string Password { get; set; }
//
//[Required]
//public string ConfirmPassword { get; set; }
//
//// [Required]
//public string FirstName { get; set; }
//
////[Required]
//public string LastName { get; set; }
//
//// [Required]
//public bool Agreement { get; set; }
//
//public int ReferrerId { get; set; }
//
////  [Required]
//public string StanfordWorkplaceURL { get; set; }
//
//public string CommunityId { get; set; }
//public string Cohort { get; set; }
//
//public string Remarks { get; set; }
//
//public string MobileNumber { get; set; }
//public string BriefBio { get; set; }
//public string Headline { get; set; }
//public string DateofBirth { get; set; }