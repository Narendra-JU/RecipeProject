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
                val eNERCKCAL: ENERCKCAL?,
                @SerializedName("FAT")
                val fAT: FAT?,
                @SerializedName("FASAT")
                val fASAT: FASAT?,
                @SerializedName("FATRN")
                val fATRN: FATRN?,
                @SerializedName("FAMS")
                val fAMS: FAMS?,
                @SerializedName("FAPU")
                val fAPU: FAPU?,
                @SerializedName("CHOCDF")
                val cHOCDF: CHOCDF?,
                @SerializedName("FIBTG")
                val fIBTG: FIBTG?,
                @SerializedName("SUGAR")
                val sUGAR: SUGAR?,
                @SerializedName("SUGAR.added")
                val sUGARAdded: SUGARAdded?,
                @SerializedName("PROCNT")
                val pROCNT: PROCNT?,
                @SerializedName("CHOLE")
                val cHOLE: CHOLE?,
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
                @SerializedName("FOLFD")
                val fOLFD: FOLFD?,
                @SerializedName("FOLAC")
                val fOLAC: FOLAC?,
                @SerializedName("VITB12")
                val vITB12: VITB12?,
                @SerializedName("VITD")
                val vITD: VITD?,
                @SerializedName("TOCPHA")
                val tOCPHA: TOCPHA?,
                @SerializedName("VITK1")
                val vITK1: VITK1?,
                @SerializedName("WATER")
                val wATER: WATER?
            ) {
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

                data class FATRN(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FAMS(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FAPU(
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

                data class SUGAR(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class SUGARAdded(
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

                data class FOLFD(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )

                data class FOLAC(
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

                data class WATER(
                    @SerializedName("label")
                    val label: String?,
                    @SerializedName("quantity")
                    val quantity: Double?,
                    @SerializedName("unit")
                    val unit: String?
                )
            }

            data class TotalDaily(
                @SerializedName("ENERC_KCAL")
                val eNERCKCAL: ENERCKCAL?,
                @SerializedName("FAT")
                val fAT: FAT?,
                @SerializedName("FASAT")
                val fASAT: FASAT?,
                @SerializedName("CHOCDF")
                val cHOCDF: CHOCDF?,
                @SerializedName("FIBTG")
                val fIBTG: FIBTG?,
                @SerializedName("PROCNT")
                val pROCNT: PROCNT?,
                @SerializedName("CHOLE")
                val cHOLE: CHOLE?,
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