package boobs.like.ramenbird.howmanypiecesuniqlo

import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import boobs.like.ramenbirds.howmanypiecesuniqlo.R

/**
 * Created by The great and powerful Android 18 on 2017/11/13.
 */
class AddDialog : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater?.inflate(R.layout.add_dialog, container)
}