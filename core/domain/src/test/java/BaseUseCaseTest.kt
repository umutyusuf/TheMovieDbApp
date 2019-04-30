import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken
import com.umut.data.model.PagedData
import com.umut.data.model.PagedResponse
import com.umut.domain.BaseUseCase
import com.umut.domain.message.MessageProvider
import com.umut.themovieapp.common.error.CommonErrorFactory
import com.umut.themovieapp.common.error.CoreAppException
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test


class BaseUseCaseTest {

    private lateinit var sampleUseCase: BaseUseCase

    //region before

    companion object {
        //region sample success response

        private const val sampleSuccessJson = "{\n" +
                "    \"page\": 1,\n" +
                "    \"total_results\": 19993,\n" +
                "    \"total_pages\": 1000,\n" +
                "    \"results\": [\n" +
                "        {\n" +
                "            \"original_name\": \"Game of Thrones\",\n" +
                "            \"id\": 1399,\n" +
                "            \"name\": \"Game of Thrones\",\n" +
                "            \"popularity\": 628.725,\n" +
                "            \"vote_count\": 5657,\n" +
                "            \"vote_average\": 8.2,\n" +
                "            \"first_air_date\": \"2011-04-17\",\n" +
                "            \"poster_path\": \"/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg\",\n" +
                "            \"genre_ids\": [\n" +
                "                10765,\n" +
                "                18,\n" +
                "                10759\n" +
                "            ],\n" +
                "            \"original_language\": \"en\",\n" +
                "            \"backdrop_path\": \"/qsD5OHqW7DSnaQ2afwz8Ptht1Xb.jpg\",\n" +
                "            \"overview\": \"Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.\",\n" +
                "            \"origin_country\": [\n" +
                "                \"US\"\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}"
        // endregion

        //region sample error response
        private const val sampleErrorJson = "{\n" +
                "    \"status_code\": 7,\n" +
                "    \"status_message\": \"Invalid API key: You must be granted a valid key.\",\n" +
                "    \"success\": false\n" +
                "}"
        // endregion

        @JvmStatic
        private lateinit var successApiResponse: PagedResponse<JsonElement>
        @JvmStatic
        private lateinit var errorApiResponse: PagedResponse<JsonElement>

        @JvmStatic
        @BeforeClass
        fun classSetup() {
            val gson = Gson()
            // parse success response
            val pagedResponseType = object : TypeToken<PagedResponse<JsonElement>>() {}.type
            successApiResponse = gson.fromJson(sampleSuccessJson, pagedResponseType)
            errorApiResponse = gson.fromJson(sampleErrorJson, pagedResponseType)
        }
    }


    @Before
    fun setup() {
        // simple usecase with common error factory
        sampleUseCase = BaseUseCase(CommonErrorFactory(), object : MessageProvider {
            override fun getMessageForCode(code: Int) = ""

            override fun provideDefaultMessage() = ""

        })
    }

    //endregion

    @Test
    fun testProcessResponseSuccess() {
        val response: PagedData<JsonElement> = sampleUseCase.processData(successApiResponse)
        assertNotNull("Parsed response should not be null", response)
    }

    @Test(expected = CoreAppException::class)
    fun testProcessResponseFail() {
        sampleUseCase.processData(errorApiResponse)
    }
}