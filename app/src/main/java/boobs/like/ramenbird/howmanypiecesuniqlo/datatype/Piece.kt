package boobs.like.ramenbird.howmanypiecesuniqlo.datatype

/**
 * Created by The great and powerful Android 14 on 2017/11/9.
 */
class Piece constructor(var tag1: Int?, var tag2: Int?, var tag3: Int?, var tag4: Int?, var tag5: Int?,
                        var tag6: Int?, var tag7: Int?, var tag8: Int?, var tag9: Int?, var tag10: Int?) {
    var p: Piece? = null
        get() = Piece(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    init {
        listOf<Int>(1, 2, 3)
    }
}

class Hoshi {

}