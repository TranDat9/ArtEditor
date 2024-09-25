package vn.tapbi.sample2021kotlin.interfaces

import vn.tapbi.arteditor.data.model.MessageThreadModel

interface OnDataListener {
    fun onDataUpdated(threadModel: MessageThreadModel?, position: Int)
}
