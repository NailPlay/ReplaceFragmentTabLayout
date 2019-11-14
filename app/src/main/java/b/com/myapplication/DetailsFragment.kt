package b.com.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_details.view.*


class DetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    // bug 2
    // bug 2
    // bug 2
    // bug 2


    // step 1Ж:wq


    // bug 1
    // bug 2
    // bug 3
// bug 6

    // bug 5
    // bug 5
    //
//
    //


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_details, container, false)
        v.back.setOnClickListener({
            fragmentManager!!.popBackStack()

        })
        return v
    }


}
