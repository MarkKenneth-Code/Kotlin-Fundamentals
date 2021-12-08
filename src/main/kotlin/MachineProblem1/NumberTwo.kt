fun main() {
    var colorsOfRainbow = mutableListOf<String>(
        "Green","Blue","Indigo", "Violet", "yellow", "blue",
        "pink",
    )
    colorChecker(colorsOfRainbow)
}

fun colorChecker( list: MutableList<String>){
    var mapColor= mutableMapOf <String,Int> ()

    var rainbow= listOf<String>("violet","yellow","orange","indigo","red","green","blue")

    for(color in list){
        if(rainbow.contains(color.lowercase())) {
            if (mapColor.containsKey(color.lowercase())) {
                mapColor.put(color.lowercase(),mapColor.getValue(color) +  1)
            } else {
                mapColor.put(color.lowercase(),  1)
            }
        }else{
            if(mapColor.containsKey("others")){
                mapColor.put("others",mapColor.getValue("others")+1)
            }else{
                mapColor.put("others",1)
            }
        }
    }
    println(mapColor)
}

