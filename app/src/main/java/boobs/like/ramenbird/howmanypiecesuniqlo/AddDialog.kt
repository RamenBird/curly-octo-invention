package boobs.like.ramenbird.howmanypiecesuniqlo

import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import boobs.like.ramenbirds.howmanypiecesuniqlo.R
import kotlinx.android.synthetic.main.add_dialog.*

/**
 * Created by The great and powerful Android 18 on 2017/11/13.
 */
class AddDialog : DialogFragment() {
    private lateinit var tags : List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tags = arguments?.getStringArrayList("tags") ?: emptyList()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater?.inflate(R.layout.add_dialog, null)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        dialog.setTitle("Input product name")
        input.setOnClickListener { it -> parse(name_input.text.toString()) }
    }

    fun parse(s: String) {

    }
}