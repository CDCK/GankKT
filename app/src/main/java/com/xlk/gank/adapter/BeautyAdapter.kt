package com.xlk.gank.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 * Created by xlk on 2020/4/27.
 *
 */
class BeautyAdapter(layoutResId: Int, data: MutableList<String>?) :
    BaseQuickAdapter<String, BaseViewHolder>(layoutResId, data) {
    override fun convert(holder: BaseViewHolder, item: String) {

    }
}