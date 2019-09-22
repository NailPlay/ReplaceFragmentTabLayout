package b.com.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private val TAG_FRAGMENT = "TAG_FRAGMENT"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_first, container, false)
        v.button.setOnClickListener({
            val transaction = getParentFragment()!!.childFragmentManager.beginTransaction()
            transaction.replace(R.id.root_frame, DetailsFragment(), TAG_FRAGMENT)
            transaction.addToBackStack(null);
            transaction.commit()
        })
        return v
    }


}
