Weather.ktpackage com.example.myapplicationkotlin

object Repository {
    private val weatherList: List<Weather>
       // get() {
       //     TODO()
       // }
    //Repository.getWeatherList()

    fun getWeatherList(): List<Weather> {
        return weatherList


    //init {
    //    weatherList = listOf( Weather("Москва", 15))
     //   }
    }
}