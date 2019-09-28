package com.app.statussaver.fragment


import android.os.AsyncTask
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.statussaver.R
import com.app.statussaver.home.HomeActivity
import com.app.statussaver.home.OnClickDownloadListener
import com.app.statussaver.home.StatusAdapter
import com.app.statussaver.utils.MyProgress
import com.app.statussaver.utils.Utils
import com.google.android.gms.ads.InterstitialAd
import kotlinx.android.synthetic.main.fragment_whatsappstatus.*
import org.apache.commons.io.comparator.LastModifiedFileComparator
import java.io.File
import java.lang.ref.WeakReference
import java.util.*
import kotlin.collections.ArrayList


/**
 * A simple [Fragment] subclass.
 */
class WhatsappstatusFragment : Fragment() {
//    override fun onClickDownload() {
//        if (mInterstitialAd.isLoaded) {
//            mInterstitialAd.show()
//        }
//    }
//
//
//    private companion object {
//        const val EXTERNAL_STORAGE_PERMISSION_CODE: Int = 343
//
//        private const val TYPE_VIDEO = 12
//        private const val TYPE_IMAGE = 13
//        private const val TYPE_SAVED = 15
//
//        class FetchFilesTask(activity: HomeActivity) : AsyncTask<Int, Int, ArrayList<File>>() {
//
//            private val mRef: WeakReference<HomeActivity> = WeakReference(activity)
//
//            override fun onPreExecute() {
//                super.onPreExecute()
//                mRef.get()?.progress?.showProgress()
//            }
//
//            override fun doInBackground(vararg p0: Int?): ArrayList<File>? {
//
//                return mRef.get()?.fetchFiles(p0[0])
//
//            }
//
//            override fun onPostExecute(result: ArrayList<File>) {
//                super.onPostExecute(result)
//                mRef.get()?.statusAdapter?.addAll(result)
//
//                mRef.get()?.progress?.hideProgress()
//
//                if (result.size == 0){
//                    mRef.get()?.showHelp()
//                }
//
//            }
//        }
//
//    }
//
//    private lateinit var progress:MyProgress
//    private lateinit var statusAdapter:StatusAdapter
//    private lateinit var mInterstitialAd: InterstitialAd

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_whatsappstatus, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        statusAdapter = StatusAdapter(context!!)
//        statusRcV.layoutManager = GridLayoutManager(context,2)
//
//        statusAdapter.setOnClickDownloadListener(this)
//
//        statusRcV.adapter = statusAdapter
//    }
//
//
//
//    fun fetchFiles(type: Int?): ArrayList<File> {
//
//        var parentDir = File(Environment.getExternalStorageDirectory().toString()+ Utils.WHATSAPP_STATUSES_LOCATION)
//
//        if (type == HomeActivity.TYPE_SAVED){
//
//            parentDir = File(Environment.getExternalStorageDirectory().toString()+ Utils.WHATSAPP_STATUSES_SAVED_LOCATION)
//        }
//
//
//        val files: Array<File>?
//        files = parentDir.listFiles()
//
//        val fetchedFiles: ArrayList<File> = ArrayList()
//
//        if (files != null) {
//
//            Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE)
//
//            for (file in files) {
//
//                if (Utils.isImageFile(this,file.path) && type == HomeActivity.TYPE_IMAGE){
//
//                    fetchedFiles.add(file)
//                }
//
//                if (Utils.isVideoFile(this,file.path) && type == HomeActivity.TYPE_VIDEO){
//
//                    fetchedFiles.add(file)
//                }
//                if (type == HomeActivity.TYPE_SAVED){
//
//                    fetchedFiles.add(file)
//                }
//
//
//            }
//        }
//
//        return fetchedFiles
//    }

}
