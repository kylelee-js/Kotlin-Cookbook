package org.example.companion_object



class Plugin {
    companion object {
        var pluginBinding: Int? = null
        private var methodChannel: Int? = null
    }

    private fun initPlugin(binding: Int){
        methodChannel = binding
        // methodChannel.setMethodCallHandler(this)
    }

    fun onAttachedToEngine(binding: Int){
        pluginBinding = binding
        if(methodChannel == null) {
            initPlugin(pluginBinding!!)
        }
    }

    fun onAttachedToActivity(binding: Int) {
        binding?.let {
            initPlugin(it)
        }
    }

    fun onDetectedFromActivity() {
        // methodChannel?.setMethodCallHandler(null)
        methodChannel = null
    }
}

fun main () {

}