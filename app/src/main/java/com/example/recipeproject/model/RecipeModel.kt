package com.example.recipeproject.model


import com.google.gson.annotations.SerializedName

data class RecipeModel(
    @SerializedName("q")
    val q: String?,
    @SerializedName("from")
    val from: Int?,
    @SerializedName("to")
    val to: Int?,
    @SerializedName("more")
    val more: Boolean?,
    @SerializedName("count")
    val count: Int?,
    @SerializedName("hits")
    val hits: List<Hit?>?
) {
    data class Hit(
        @SerializedName("recipe")
        val recipe: Recipe?
    ) {
        data class Recipe(
            @SerializedName("uri")
            val uri: String?,
            @SerializedName("label")
            val label: String?,
            @SerializedName("image")
            val image: String?,
            @SerializedName("source")
            val source: String?,
            @SerializedName("url")
            val url: String?,
            @SerializedName("shareAs")
            val shareAs: String?,
            @SerializedName("yield")
            val yield: Double?,
            @SerializedName("dietLabels")
            val dietLabels: List<String?>?,
            @SerializedName("healthLabels")
            val healthLabels: List<String?>?,
            @SerializedName("cautions")
            val cautions: List<String?>?,
            @SerializedName("ingredientLines")
            val ingredientLines: List<String?>?,
            @SerializedName("ingredients")
            val ingredients: List<Ingredient?>?,
            @SerializedName("calories")
            val calories: Double?,
            @SerializedName("totalWeight")
            val totalWeight: Double?,
            @SerializedName("totalTime")
            val totalTime: Double?,
            @SerializedName("cuisineType")
            val cuisineType: List<String?>?,
            @SerializedName("mealType")
            val mealType: List<String?>?,
            @SerializedName("dishType")
            val dishType: List<String?>?,
            @SerializedName("totalNutrients")
            val totalNutrients: TotalNutrients?,
            @SerializedName("totalDaily")
            val totalDaily: TotalDaily?,
            @SerializedName("digest")
            val digest: List<Digest?>?
        ) {
            data class Ingredient(
                @SerializedName("text")
                val text: String?,
                @SerializedName("weight")
                val weight: Double?,
                @SerializedName("foodCategory")
                val foodCategory: String?,
                @SerializedName("foodId")
                val foodId: String?,
                @SerializedName("image")
                val image: String?
            )

           data class TotalNutrients(
               @SerializedName("ENERC_KCAL")
                val eNERCKCAL: Nutrient?,
               @SerializedName("FAT")
                val fAT: Nutrient?,
               @SerializedName("FASAT")
                val fASAT: Nutrient?,
               @SerializedName("FATRN")
                val fATRN: Nutrient?,
               @SerializedName("FAMS")
                val fAMS: Nutrient?,
               @SerializedName("FAPU")
                val fAPU: Nutrient?,
               @SerializedName("CHOCDF")
                val cHOCDF: Nutrient?,
               @SerializedName("FIBTG")
                val fIBTG: Nutrient?,
               @SerializedName("SUGAR")
                val sUGAR: Nutrient?,
               @SerializedName("SUGAR.added")
                val sUGARAdded: Nutrient?,
               @SerializedName("PROCNT")
                val pROCNT: Nutrient?,
               @SerializedName("CHOLE")
                val cHOLE: TotalDaily.CHOLE?,
               @SerializedName("NA")
                val nA: TotalDaily.NA?,
               @SerializedName("CA")
                val cA: TotalDaily.CA?,
               @SerializedName("MG")
                val mG: TotalDaily.MG?,
               @SerializedName("K")
                val k: TotalDaily.K?,
               @SerializedName("FE")
                val fE: TotalDaily.FE?,
               @SerializedName("ZN")
                val zN: TotalDaily.ZN?,
               @SerializedName("P")
                val p: TotalDaily.P?,
               @SerializedName("VITA_RAE")
                val vITARAE: TotalDaily.VITARAE?,
               @SerializedName("VITC")
                val vITC: TotalDaily.VITC?,
               @SerializedName("THIA")
                val tHIA: TotalDaily.THIA?,
               @SerializedName("RIBF")
                val rIBF: TotalDaily.RIBF?,
               @SerializedName("NIA")
                val nIA: TotalDaily.NIA?,
               @SerializedName("VITB6A")
                val vITB6A: TotalDaily.VITB6A?,
               @SerializedName("FOLDFE")
                val fOLDFE: TotalDaily.FOLDFE?,
               @SerializedName("FOLFD")
                val fOLFD: Nutrient?,
               @SerializedName("FOLAC")
                val fOLAC: Nutrient?,
               @SerializedName("VITB12")
                val vITB12: TotalDaily.VITB12?,
               @SerializedName("VITD")
                val vITD: TotalDaily.VITD?,
               @SerializedName("TOCPHA")
                val tOCPHA: TotalDaily.TOCPHA?,
               @SerializedName("VITK1")
                val vITK1: TotalDaily.VITK1?,
               @SerializedName("WATER")
                val wATER: Nutrient?
            ) {
                fun getTotalList(): MutableList<Nutrient?> {
                return mutableListOf(eNERCKCAL,fAT,fASAT,fIBTG,pROCNT)
            }

            }

            data class TotalDaily(
                @SerializedName("ENERC_KCAL")
                val eNERCKCAL: Nutrient?,
                @SerializedName("FAT")
                val fAT: Nutrient?,
                @SerializedName("FASAT")
                val fASAT: Nutrient?,
                @SerializedName("CHOCDF")
                val cHOCDF: Nutrient?,
                @SerializedName("FIBTG")
                val fIBTG: Nutrient?,
                @SerializedName("PROCNT")
                val pROCNT: Nutrient?,
                @SerializedName("CHOLE")
                val cHOLE: Nutrient?,
                @SerializedName("NA")
                val nA: NA?,
                @SerializedName("CA")
                val cA: CA?,
                @SerializedName("MG")
                val mG: MG?,
                @SerializedName("K")
                val k: K?,
                @SerializedName("FE")
                val fE: FE?,
                @SerializedName("ZN")
                val zN: ZN?,
                @SerializedName("P")
                val p: P?,
                @SerializedName("VITA_RAE")
                val vITARAE: VITARAE?,
                @SerializedName("VITC")
                val vITC: VITC?,
                @SerializedName("THIA")
                val tHIA: THIA?,
                @SerializedName("RIBF")
                val rIBF: RIBF?,
                @SerializedName("NIA")
                val nIA: NIA?,
                @SerializedName("VITB6A")
                val vITB6A: VITB6A?,
                @SerializedName("FOLDFE")
                val fOLDFE: FOLDFE?,
                @SerializedName("VITB12")
                val vITB12: VITB12?,
                @SerializedName("VITD")
                val vITD: VITD?,
                @SerializedName("TOCPHA")
                val tOCPHA: TOCPHA?,
                @SerializedName("VITK1")
                val vITK1: VITK1?
            ) {
                fun getTotalList(): MutableList<Nutrient?> {
                    return mutableListOf(eNERCKCAL,fAT,fASAT,fIBTG,pROCNT)
                }
                data class ENERCKCAL(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FAT(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FASAT(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class CHOCDF(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FIBTG(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class PROCNT(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class CHOLE(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class NA(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class CA(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class MG(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class K(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FE(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class ZN(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class P(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class VITARAE(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class VITC(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class THIA(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class RIBF(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class NIA(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class VITB6A(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FOLDFE(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class VITB12(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class VITD(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class TOCPHA(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class VITK1(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )
            }

            data class Digest(
                @SerializedName("label")
                val label: String?,
                @SerializedName("tag")
                val tag: String?,
                @SerializedName("schemaOrgTag")
                val schemaOrgTag: String?,
                @SerializedName("total")
                val total: Double?,
                @SerializedName("hasRDI")
                val hasRDI: Boolean?,
                @SerializedName("daily")
                val daily: Double?,
                @SerializedName("unit")
                val unit: String?,
                @SerializedName("sub")
                val sub: List<Sub?>?
            ) {
                data class Sub(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("tag")
                    val tag: String?,
                    @SerializedName("schemaOrgTag")
                    val schemaOrgTag: String?,
                    @SerializedName("total")
                    val total: Double?,
                    @SerializedName("hasRDI")
                    val hasRDI: Boolean?,
                    @SerializedName("daily")
                    val daily: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )
            }
        }
    }
}
data class Nutrient(@SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
)

